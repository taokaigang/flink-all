package day27.aExercise;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/27
 * @Description
 */
public class Person implements Serializable {
    private String name;
    private int age;
    private Gender gender;
    private int height;
    private int weight;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    // 根据文件中存储的一行的信息，实例化一个当前类的对象
    public Person(String info) {
        // 1. 按照逗号进行切割，得到每一个键值对
        String[] parts = info.split(",+");
        // 2. 遍历数组中的字符串
        Map<String, String> properties = new HashMap<>();
        for (String part : parts) {
            // 2.1. 将part按照冒号切割成两部分
            String[] tmp = part.split(":");
            // 2.2. 将键值对存入Map集合
            properties.put(tmp[0], tmp[1]);
        }
        // 3. 遍历Map，取每一个键值对，给属性进行赋值
        this.name = properties.get("name");
        this.age = Integer.parseInt(properties.get("age").replace("岁", ""));
        this.height = Integer.parseInt(properties.get("height").replace("cm", ""));
        this.weight = Integer.parseInt(properties.get("weight").replace("kg", ""));
        this.gender = Gender.getGender(properties.get("gender"));
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}

enum Gender {
    Male, Female;

    public static Gender getGender(String msg) {
        if (msg == null)
            return null;
        if (msg.equalsIgnoreCase("male")) {
            return Gender.Male;
        }
        else if (msg.equalsIgnoreCase("female")) {
            return Gender.Female;
        }
        return null;
    }
}
