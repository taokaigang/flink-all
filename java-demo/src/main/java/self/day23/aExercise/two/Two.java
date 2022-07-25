package self.day23.aExercise.two;

import java.util.*;
import java.util.stream.Stream;

public class Two {
    /**
     * 2. 【难】已知⼀个⽂本内容如下：
     *  name:xiaoming,age:10岁,gender:male,height:172cm,weight:70kg
     *  age:20岁,height:177cm,name:xiaobai,weight:80kg,gender:male
     *  gender:female,height:176cm,weight:66kg,name:xiaolv,age:21岁
     *      每⼀⾏是数据为⼀个⼈的信息，但是顺序是不固定的。
     *      2.1. 读取这些数据，每⼀⾏的数据封装到⼀个 Person 对象中，并存⼊⼀个 List 集合
     *      2.2. 删除集合中所有的未成年的数据
     *      2.3. 计算所有⼈的平均年龄、最⼤年龄、最⼩年龄
     *      2.4. 将集合中的数据按照年龄进⾏降序排序，若年龄相同，按照身⾼降序排序
     *      2.5. 查询集合中所有的年龄在[20, 25]范围内，体重在[60, 80]范围内的数据，按照身⾼降序排列，截取第4名到第8名。
     * @param args
     */
    public static void main(String[] args) {
        List<Person> list=new ArrayList<>();
        Stream<Person> stream=list.stream();
        String data = "name:xiaoming,age:10岁,gender:male,height:172cm,weight:70kg\n" +
                "age:20岁,height:177cm,name:xiaobai,weight:80kg,gender:male\n" +
                "gender:female,height:176cm,weight:66kg,name:xiaolv,age:21岁";
        String[] split = data.split("\n");
        for (String str : split) {
            list.add(new Person(str));
        }

    }
}
