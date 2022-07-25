package day27.aExercise;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Scanner;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/27
 * @Description
 */
public class Program {

    public static void main(String[] args) {
        // oneCopyFile();
        List<Person> list = getDataSource();

        // 删除集合中所有的未成年的数据
        list.removeIf(person -> person.getAge() < 18);
        // 计算所有人的平均年龄、最大年龄、最小年龄
        IntSummaryStatistics intSummaryStatistics = list.stream().mapToInt(Person::getAge).summaryStatistics();
        System.out.println("最大年龄: " + intSummaryStatistics.getMax());
        System.out.println("最小年龄: " + intSummaryStatistics.getMin());
        System.out.println("平均年龄: " + intSummaryStatistics.getAverage());
        // 将集合中的数据按照年龄进行降序排序，若年龄相同，按照身高降序排序
        list.sort((p1, p2) -> {
            if (p1.getAge() != p2.getAge()) {
                return p2.getAge() - p1.getAge();
            }
            return p2.getHeight() - p1.getHeight();
        });
        // 查询集合中所有的年龄在[20, 25]范围内，体重在[60, 80]范围内的数据，按照身高降序排列，截取第4名到第8名。
        list.stream().filter(person -> person.getAge() >= 20 && person.getAge() <= 25)
                .filter(person -> person.getWeight() >= 60 && person.getWeight() <= 80)
                .sorted((p1, p2) -> p2.getHeight() - p1.getHeight())
                .limit(8)
                .skip(3)
                .forEach(System.out::println);

        // save(list);
        load();
    }

    private static void load() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file\\day27\\source\\list"))) {
            // 读取数据
            Object obj = ois.readObject();
            // 向下转型
            if (obj instanceof List) {
                List<Person> list = (List<Person>)obj;
                list.forEach(System.out::println);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // 将集合中的数据序列化到本地
    private static void save(List<Person> list) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("file\\day27\\source\\list"))) {
            // 如果要序列化多个对象，只需要序列化这个集合即可
            outputStream.writeObject(list);
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // 读取这个文本中的数据，将每一行的数据封装到一个 Person 对象中，并存入一个 List 集合
    private static List<Person> getDataSource() {
        // 1. 实例化一个Scanner对象，读取一个文件中的数据
        try (Scanner scanner = new Scanner(new File("file\\day27\\source\\src"))) {
            // 2. 实例化一个集合，用来存储Person对象
            List<Person> list = new ArrayList<>();
            // 3. 逐行读取数据
            while (scanner.hasNextLine()) {
                // 4. 将读取到的一行数据，做成对象，存入集合
                list.add(new Person(scanner.nextLine()));
            }
            // 5. 返回集合
            return list;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void oneCopyFile() {
        // 1. 在指定的位置创建一个文件夹
        String dirPath = "file\\day27\\source\\";
        boolean flag = new File(dirPath).mkdir();

        // 2. 拷贝到dirPath下的src的文件中
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("file\\day27\\desktop\\source"), "GBK"));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dirPath + "\\src"), StandardCharsets.UTF_8))) {
            // 3. 拷贝数据
            String line = "";
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
