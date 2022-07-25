package day27.bio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/27
 * @Description
 */
public class Program {
    public static void main(String[] args) {
        // 1. 实例化一个Properties对象
        Properties properties = new Properties();

        // 2. 加载一个 .properties 文件中的数据
        try {
            properties.load(new FileReader("file\\day27\\my.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 3. 遍历
        System.out.println(properties);

        // 4. 键值对的增删改查
        //    由于这个类是Map的实现类，因此在Map集合中定义的所有的方法，它都有。
        //    但是，对于Properties类的来说，增删改查基本上不用从Map中继承到的方法。
        //    因为，从Map集合中继承下来的方法，键和值都是Object类型的。
        // 4.1. 可以在集合中新增一个键值对，也可以修改集合中的存在的键值对。
        properties.setProperty("userlevel", "12");
        properties.setProperty("password", "ABCDEFG");

        // 4.2. 通过键，获取值
        String level = properties.getProperty("userlevel");
        String id = properties.getProperty("userid", "123");

        System.out.println(properties);

        // 5. 将内存中的数据，同步到文件中
        try {
            properties.store(new FileWriter("file\\day27\\my.properties"), "hello");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}