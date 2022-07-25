package self.day8.D;

import self.day8.A.Dog;
import self.day8.C.Dot;

import java.util.Arrays;

public class Four {
    /**
     * 4. （难）设计一个人类，具有属性：姓名、年龄。在主方法中，实例化10个人类对象，存入一个数组。将数
     * 组中的元素按照年龄进行升序排序。遍历输出每一个人的信息。
     * @param args
     */
    public static void main(String[] args) {

        /*Person[] person= new Person[10];
        person[0]=new Person();
        person[0].name="aaa";
        person[0].age=11;
        person[1]=new Person();
        person[1].name="bbb";
        person[1].age=12;
        person[2]=new Person();
        person[2].name="ccc";
        person[2].age=33;
        person[3]=new Person();
        person[3].name="ddd";
        person[3].age=14;
        person[4]=new Person();
        person[4].name="eee";
        person[4].age=11;
        person[5]=new Person();
        person[5].name="fff";
        person[5].age=23;
        person[6]=new Person();
        person[6].name="ggg";
        person[6].age=10;
        person[7]=new Person();
        person[7].name="hhh";
        person[7].age=9;
        person[8]=new Person();
        person[8].name="iii";
        person[8].age=7;
        person[9]=new Person();
        person[9].name="jjj";
        person[9].age=10;

//        void fill(Person[] person){
//            for (int i = 0; i < person.length; i++) {
//                person[i]=new Person();
//            }
//        }

        for (int i = 0; i < person.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < person.length; j++) {
                if (person[minIndex].age > person[j].age) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                Person tmp = person[i];
                person[i] = person[minIndex];
                person[minIndex] = tmp;
            }

        }

        for (int i = 0; i < person.length; i++) {
           System.out.println(person[i].name+":"+person[i].age);
        }*/

        Person[] person=new Person[10];


    }

    static void fill(Person[] array){
        String[] names={"张一", "张二", "张三", "张四", "张武", "张柳", "张琦", "张八", "张就", "张氏"};
        int[] ages={19,20,32,18,23,39,26,28,45,22};

        for (int i = 0; i < array.length; i++) {
            array[i] =new Person();
            array[i].name=names[i];
            array[i].age=ages[i];
        }

    }
}
