package self.day12.aExercise.two;

public class Two {
    /**
     * 2. 【中】已知方法如下，可以实现对一个数组中的元素，按照指定规则排序。实现下面方法。
     * @param args
     */
    public static void main(String[] args) {
        Person[] array = new Person[]{
                new Person("xiaobai", 12, 166, 50),
                new Person("xiaohei", 11, 156, 55),
                new Person("xiaohuang", 19, 176, 70),
                new Person("xiaolv", 15, 164, 66),
                new Person("xiaocheng", 13, 136, 60),
                new Person("xiaohong", 17, 168, 45),
                new Person("xiaolan", 22, 169, 54)
        };
        //按照年龄排序
        sort(array, new PersonComparator() {
            @Override
            public int compare(Person person1, Person person2) {
                return person1.age - person2.age;
            }
        });
        for (Person person : array) {
            System.out.println(person);
        }
        System.out.println("=============================================");

        // 按照身高进行排序
        sort(array, new PersonComparator() {
            @Override
            public int compare(Person person1, Person person2) {
                return person1.height-person2.height;
            }
        });
        for (Person person : array) {
            System.out.println(person);
        }
        System.out.println("=============================================");
        // 按照体重进行排序
        sort(array, new PersonComparator() {
            @Override
            public int compare(Person person1, Person person2) {
                return person1.weight-person2.weight;
            }
        });
        for (Person person : array) {
            System.out.println(person);
        }

    }

    public static void sort(Person[] array, PersonComparator comparator){
        // 如果按照年龄进行升序排序
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                // 使用接口中提供的Person对象的大小比较的规则，对两个Person对象进行大小比较
                if (comparator.compare(array[minIndex], array[j]) > 0) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                Person tmp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = tmp;
            }
        }
    }
}
