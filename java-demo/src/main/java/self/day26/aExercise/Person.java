package self.day26.aExercise;

import java.util.HashMap;
import java.util.Map;

public class Person {
    private String name;
    private int age;
    private Gender gender;
    private int height;
    private int weight;

    // name:xiaoming,age:10岁,gender:male,height:172cm,weight:70kg
    public Person(String info) {
        // 1. 按照逗号进行切割
        String[] keyValues = info.split(",");
        // 2. 遍历数组中的每一个键值对
        Map<String, String> map = new HashMap<>();
        for (String keyValue : keyValues) {
            String[] tmp = keyValue.split(":");
            map.put(tmp[0], tmp[1]);
        }
        // 3. 给每一个属性赋值
        this.name = map.get("name");
        this.age = Integer.parseInt(map.get("age").replace("岁", ""));
        this.height = Integer.parseInt(map.get("height").replace("cm", ""));
        this.weight = Integer.parseInt(map.get("weight").replace("kg", ""));
        this.gender = Gender.getGender(map.get("gender"));
    }

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
enum Gender{
    Male,Female;

    public static Gender getGender(String msg) {
        if (msg.equalsIgnoreCase("male")) {
            return Gender.Male;
        }
        else if (msg.equalsIgnoreCase("female")) {
            return Gender.Female;
        }
        return null;
    }
}
