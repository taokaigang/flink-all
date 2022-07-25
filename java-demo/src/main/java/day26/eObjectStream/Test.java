package day26.eObjectStream;

import java.io.*;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/26
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        load();
    }

    /**
     * 反序列化
     */
    private static void load() {
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("file\\day26\\person"))) {
            // 读取文件中的数据
            Object obj = inputStream.readObject();

            if (obj instanceof Person) {
                Person xiaoming = (Person)obj;
                System.out.println(xiaoming);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 序列化
     */
    private static void save() {
        // 实例化一个Person对象
        Person xiaoming = new Person("xiaoming", 12, 100);

        // 序列化对象
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("file\\day26\\person"))) {
            // 序列化
            outputStream.writeObject(xiaoming);
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
