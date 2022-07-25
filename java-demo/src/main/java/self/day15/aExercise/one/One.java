package self.day15.aExercise.one;

public class One {
    /**
     * 设计一个Person类，属性：姓名、生日(Date)、性别(枚举)。根据如下代码设计相关程序：
     * @param args
     */
    public static void main(String[] args) {
        // 1. 实例化一个Person对象
        Person xiaoming = new Person("小明","2000-08-06", Gender.Male);
        // 2. 输出小明
        System.out.println(xiaoming); // 姓名: 小明, 生日: 2000年8月6日， 性别: 男

    }
}
