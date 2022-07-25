package day9.aExercise.one;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/1
 * @Description
 *      设计一个人类，具有 属性：姓名、年龄、所有的宠物狗（不止一个）。
 *                     设计方法：遍历输出每一只宠物狗的姓名、年龄、毛色。
 */
public class One {
    public static void main(String[] args) {
        // 1. 实例化一个人类对象
        Person person = new Person();
        // 2. 设置相关的属性
        person.name = "uncle wang";
        person.age = 40;
        person.pets = new Dog[5];       // 此时，person.pets 不再是null
                                        // 但是要注意！！！ 数组中的元素，现在是5个null。
        // 3. 把相关信息整理一下
        String[] names = { "小白", "小黑", "大黄", "小小白", "小小黑" };
        int[] ages = { 1, 2, 1, 2, 1 };
        String[] furColor = { "白色", "黑色", "黄色", "白色", "黑色" };

        for (int i = 0; i < person.pets.length; i++) {
            // 实例化一个狗的对象
            Dog dog = new Dog();
            dog.name = names[i];
            dog.age = ages[i];
            dog.furColor = furColor[i];

            person.pets[i] = dog;
        }

        // 让人介绍所有的狗
        person.showPets();
    }
}
