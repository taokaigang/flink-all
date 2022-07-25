package self.day11.aExercise.one;

public class One {

    /**
     *1.# （难）已知方法如下，可以实现对一个数组中的元素，按照指定规则排序。实现下面方法。
     *
     * 提示： PersonComparator其实是一个用来比较两个Person对象大小关系的接口。
     * @param args
     */
    public static void main(String[] args) {
        Person[] array=new Person[]{
                new Person("张三",18),
                new Person("李四",20)
        };

       
        //sort(Person[] array, PersonComparator comparator);

    }

    public static void sort(Person[] array, PersonComparator comparator){
        PersonComparatorImpl pc=new PersonComparatorImpl();
        comparator.compute(array[0].getAge(),array[1].getAge());
    }
}
