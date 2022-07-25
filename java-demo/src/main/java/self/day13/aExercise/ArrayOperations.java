package self.day13.aExercise;

import java.util.Arrays;
public class ArrayOperations {

        // 以指定的大小比较规则， 比较数组中的元素， 实现对数组中的元素进行升序排序
        public static void sort(Person[] persons, PersonComparator comparator) {
            for (int i = 0; i < persons.length-1; i++) {
                int minIndex=i;
                for (int j = i+1; j < persons.length; j++) {
                    if (comparator.comparator(persons[minIndex],persons[j])>0){
                        minIndex=j;
                    }
                }
                if (minIndex!=i){
                    Person tmp=persons[minIndex];
                    persons[minIndex]=persons[i];
                    persons[i]=tmp;
                }
            }
        }

        // 获取满足条件的数据， 并存入到一个数组中， 将这个数组返回
        // 例如： 获取数组中所有的年龄 > 10的数据
        public static Person[] get(Person[] persons, PersonPredicate predicate) {
            Person[] elements = new Person[0];
            for (int i = 0; i < persons.length; i++) {
               if (predicate.predicate(persons[i])){
                   // 1. 实例化一个新的数组，将原来数组中的元素，拷贝到新的数组中
                   Person[] tmp = Arrays.copyOf(elements, elements.length + 1);
                   // 2. 将需要添加的元素，存到tmp数组的最后位
                   tmp[tmp.length - 1] = persons[i];
                   // 3. 重新定义属性elements的地址指向
                   elements = tmp;
               }

            }

            return elements;
        }

        // 删除数组中所有的满足条件的数据， 并返回存储有所有的删除之后剩余的数据
        public static Person[] removeIf(Person[] persons, PersonPredicate predicate) {
            Person[] elements = new Person[0];
            for (int i = 0; i < persons.length; i++) {
                if (!predicate.predicate(persons[i])){
                    // 1. 实例化一个新的数组，将原来数组中的元素，拷贝到新的数组中
                    Person[] tmp = Arrays.copyOf(elements, elements.length + 1);
                    // 2. 将需要添加的元素，存到tmp数组的最后位
                    tmp[tmp.length - 1] = persons[i];
                    // 3. 重新定义属性elements的地址指向
                    elements = tmp;
                }

            }

            return elements;

        }

        // 获取按照指定的规则进行对象大小比较时， 最大的元素
        public static Person getMax(Person[] persons, PersonComparator comparator) {
            for (int i = 0; i < persons.length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < persons.length; j++) {
                    // 使用接口中提供的Person对象的大小比较的规则，对两个Person对象进行大小比较
                    if (comparator.comparator(persons[minIndex], persons[j]) > 0) {
                        minIndex = j;
                    }
                }

                if (minIndex != i) {
                    Person tmp = persons[minIndex];
                    persons[minIndex] = persons[i];
                    persons[i] = tmp;
                }
            }
            return persons[persons.length-1];
        }

}
