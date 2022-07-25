package day28.aExercise;

import java.io.*;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/28
 * @Description
 */
public class Program {
    public static void main(String[] args) {
        // 2. 获取数据
        List<User> dataSource = getDataSource();
        // 3.
        distinctById(dataSource);

        // 计算这些用户的平均等级、最高等级、最低等级
        IntSummaryStatistics intSummaryStatistics = dataSource.stream().mapToInt(User::getId).summaryStatistics();
        System.out.println("最高等级: " + intSummaryStatistics.getMax());
        System.out.println("最低等级: " + intSummaryStatistics.getMin());
        System.out.println("平均等级: " + intSummaryStatistics.getAverage());

        // 将集合中的数据按照等级降序排序
        dataSource.sort((u1, u2) -> u2.getId() - u1.getId());

        // 查询集合中等级为[7,15]范围内的第[4,8]个，并将结果按照id升序
        dataSource.stream().filter(user -> user.getId() >= 7 && user.getId() <= 15)
                .limit(8)
                .skip(3)
                .sorted((u1, u2) -> u1.getId() - u2.getId())
                .forEach(System.out::println);

        // save(dataSource);

        load();
    }

    private static void save(List<User> users) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file\\day28\\list"))) {
            // 序列化数据
            oos.writeObject(users);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void load() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file\\day28\\list"))) {
            Object object = ois.readObject();
            if (object instanceof List) {
                List<User> list = (List<User>) object;

                list.forEach(System.out::println);
            }
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    /**
     * 3. 去除集合中id重复的数据，只保留重复id的第一个数据
     * @param list 集合
     */
    private static void distinctById(List<User> list) {
        // 1. 手动实现
        // for (int i = 0; i < list.size(); i++) {
        //     for (int j = i + 1; j < list.size(); j++) {
        //         if (list.get(i).getId() == list.get(j).getId()) {
        //             // 删除第j位的元素
        //             list.remove(j--);
        //         }
        //     }
        // }

        // 2. 集合流式编程
        // List<User> collect = list.stream().distinct().collect(Collectors.toList());
        // list.clear();
        // list.addAll(collect);

        // 3. 借助LinkedHashSet
        LinkedHashSet<User> users = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(users);
    }

    private static List<User> getDataSource() {
        // 1. 实例化一个集合
        List<User> list = new ArrayList<>();
        // 2. 循环读取每一行的数据
        try (BufferedReader reader = new BufferedReader(new FileReader("file\\day28\\source"))) {
            // 3. 逐行读取数据
            String line = "";
            while ((line = reader.readLine()) != null) {
                list.add(new User(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
