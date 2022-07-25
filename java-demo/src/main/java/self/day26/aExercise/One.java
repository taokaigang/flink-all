package self.day26.aExercise;

import java.io.*;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;

public class One {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        //copy("file\\day26\\source","file\\source\\source-副本");
        //1.3、读取这个文本中的数据，将每一行的数据封装到一个 Person 对象中，并存入一个 List 集合
        // 1. 获取数据源
        List<Person> list = getDataSource("file\\source\\source-副本");
        //1.4、删除集合中所有的未成年的数据
        list.removeIf(e->e.getAge()<18);
        //1.5、计算所有人的平均年龄、最大年龄、最小年龄
        System.out.println("----------2.3. 计算所有⼈的平均年龄、最⼤年龄、最⼩年龄----------");
        IntSummaryStatistics intSummaryStatistics = list.stream().mapToInt(Person::getAge).summaryStatistics();
        System.out.println("平均年龄: " + intSummaryStatistics.getAverage());
        System.out.println("最大年龄: " + intSummaryStatistics.getMax());
        System.out.println("最小年龄: " + intSummaryStatistics.getMin());
        //1.6、将集合中的数据按照年龄进行降序排序，若年龄相同，按照身高降序排序
        list.sort((p1, p2) -> {
            if (p1.getAge() != p2.getAge()) {
                return p2.getAge() - p1.getAge();
            }
            return p2.getHeight() - p1.getHeight();
        });

        //1.7、查询集合中所有的年龄在[20, 25]范围内，体重在[60, 80]范围内的数据，按照身高降序排列，截取第4名到第8名。
        list.stream().filter(person -> person.getAge() >= 20 && person.getAge() <= 25)
                .filter(person -> person.getWeight() >= 60 && person.getWeight() <= 80)
                .sorted((p1, p2) -> p2.getHeight() - p1.getHeight())
                .limit(8)
                .skip(3)
                .forEach(System.out::println);

        //1.7、将集合中的数据序列化到本地
        save(list);
        //1.8、将本地序列化的文件反序列化，得到集合，并遍历输出里面的内容
        load();


    }

    /**
     * 1.2、将桌面创建的文件用代码复制到项目下的 file\\source 路径下。
     */
    private static void copy(String srcPath, String dstPath){
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(srcPath), "GBK"));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dstPath)))) {
            // 循环读写数据
            String line = "";
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            writer.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static List<Person> getDataSource(String source) {
        try(BufferedReader reader=new BufferedReader(new FileReader(source))){
            // 1. 定义一个字符串，用来接收每一行读取到的数据
            String line = "";
            List<Person> list = new ArrayList<>();
            // 2. 循环读取数据
            while ((line = reader.readLine()) != null) {
                // 1. 按照换行符切割字符串，得出每一行的信息
                String[] lines = line.split("\n");
                // 2. 实例化一个集合，存储有Person对象信息
                // 3. 添加信息
                for (String li : lines) {
                    // 把每一行的信息，封装成一个Person对象，存入集合list
                    list.add(new Person(li));
                }
            }
            return list;
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 反序列化
     */
    private static void load() {
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("file\\source\\person"))) {
            // 读取文件中的数据
            Object obj = inputStream.readObject();

            if (obj instanceof Person) {
                //Person xiaoming = (Person)obj;
                System.out.println((Person)obj);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 序列化
     */
    private static void save(List<Person> list) {
        // 实例化一个Person对象
        //Person xiaoming = new erson("xiaoming", 12, 100);
        // 序列化对象
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("file\\source\\person"))) {
            // 序列化
            for (int i = 0; i < list.size(); i++) {
                outputStream.writeObject(list.get(i).getName());
            }
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
