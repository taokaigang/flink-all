package self.day8.A;

public class Program {
    /**
     * 1. （易）设计一个人类，具有属性：姓名、年龄、所有的宠物狗（不止一个）。设计方法：遍历输出每一只宠
     * 物狗的姓名、年龄、毛色。
     * @param args
     */
    public static void main(String[] args) {
        Person person=new Person();
        person.name="小明";
        person.age=10;
//        person.pets= new Dog[2];//有疑问？？
        Dog[] dog= new Dog[2];//等价于
        person.pets=dog;
        //这一步很重要  要在数组中存对象   //实例化
        person.pets[0]=new Dog();
        person.pets[1]=new Dog();

        person.pets[0].name="Golden";
        person.pets[0].age=3;
        person.pets[0].furColor="金黄色";

        person.pets[1].name="Husky";
        person.pets[1].age=3;
        person.pets[1].furColor="黑白";

        person.showPets();
    }

}
