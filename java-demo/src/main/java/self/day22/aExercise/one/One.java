package self.day22.aExercise.one;

import java.util.HashSet;

public class One {
    /**
     * 1. 【简】设计⼀个动物类Animal类，有编号，姓名，性别，年龄属性，将多个动物对象添加到⼀个
     *      HashSet集合中时，若所有的属性值都相同则是为相同对象；在主⽅法中创建三个Animal对象，添
     *      加到⼀个HashSet集合中，输出集合中元素的个数
     * @param args
     */
    public static void main(String[] args) {
        Animal animal1=new Animal(111,"小黑",Gender.Male,5);
        Animal animal2=new Animal(112,"小白",Gender.Male,7);
        Animal animal3=new Animal(111,"小黑",Gender.Male,5);

        HashSet hashSet=new HashSet();
        hashSet.add(animal1);
        hashSet.add(animal2);
        hashSet.add(animal3);

        System.out.println(hashSet);
    }
}
