package self.day22.aExercise.two;

import java.util.Collections;
import java.util.TreeSet;

public class Two {
    /**
     * 2. 【简】向TreeSet集合中加⼊5个员⼯的对象，根据员⼯的年龄（升序）进⾏排序，若年龄相同，再
     *      根据⼯龄（降序）来排序，若⼯龄相同，根据薪⽔（降序）排序（⽤两种⽅式实现）
     * @param args
     */
    public static void main(String[] args) {
        TreeSet treeSet=new TreeSet();
        TreeSet<Staff> treeSet2=new TreeSet<>((p1,p2)-> {
            if (p1.getAge() != p2.getAge()) {
                return p1.getAge() - p2.getAge();
            }
            if (p1.getSeniority() != p2.getSeniority()) {
                return p2.getSeniority() - p1.getSeniority();
            }
            return p2.getSalary() - p1.getSalary();
        });

        Collections.addAll(treeSet,
                new Staff("小明",18,3,1500),
                new Staff("小红",19,2,2000),
                new Staff("韩梅梅",20,3,2500),
                new Staff("张三",20,2,3000),
                new Staff("李四",20,2,3100)
                );
        Collections.addAll(treeSet2,
                new Staff("小明",18,3,1500),
                new Staff("小红",19,2,2000),
                new Staff("韩梅梅",20,3,2500),
                new Staff("张三",20,2,3000),
                new Staff("李四",20,2,3100)
                );

        treeSet.forEach(System.out::println);
        System.out.println("---------------------------------------------");
        treeSet2.forEach(System.out::println);
    }
}
