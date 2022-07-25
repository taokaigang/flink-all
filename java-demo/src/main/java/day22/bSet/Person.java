package day22.bSet;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/21
 * @Description
 */
public class Person {
    String name;
    int age;
    int score;
    int height;
    int weight;

    public Person(String name, int age, int score, int height, int weight) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    /**
     * 制定了大小比较的规则
     * @param o 和this进行比较的Person对象
     * @return 比较结果
     *      > 0 :   this > o
     *      ==0 :   this == o
     *      < 0 :   this < o
     */
//    @Override
//    public int compareTo(Person o) {
//        return this.age - o.age;
//    }
}
