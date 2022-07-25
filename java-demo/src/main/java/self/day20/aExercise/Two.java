package self.day20.aExercise;

import java.util.ArrayList;
import java.util.Collection;

public class Two {
    /**
     * 2. 【简】设计一个方法，删除一个集合中，所有的指定的元素。例如，将集合中所有的3都删除。
     * @param args
     */
    public static void main(String[] args) {
        Collection<Integer> collection=new ArrayList<>();
        collection.add(3);
        collection.add(20);
        collection.add(3);
        collection.add(40);
        delSpecifiedElement(collection, 3);
        collection.forEach(System.out::println);

        Collection<String> collection2=new ArrayList<>();
        collection2.add("3");
        collection2.add("20");
        collection2.add("3");
        collection2.add("40");
        delSpecifiedElement(collection2, "3");
        collection2 .forEach(System.out::println);
    }
    private static <E> void delSpecifiedElement(Collection<E> collection,E ele){
        for (int i = 0; i < collection.size(); i++) {
            if (collection.contains(ele)){
                collection.remove(ele);
            }
        }
    }
}
