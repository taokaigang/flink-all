package day9.aExercise.one;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/1
 * @Description
 */
public class Person {
    String name;
    int age;
    Dog[] pets;     // 不止一个宠物狗

    // 输出每一只宠物狗的信息
    void showPets() {
        if (pets == null || pets.length == 0) {
            System.out.println("我现在没有养狗");
            return;
        }
        // 遍历数组
        for (Dog dog : pets) {
            // 调用狗类的方法，获取狗类的信息
            System.out.println(dog.getInfo());
        }
    }
}
