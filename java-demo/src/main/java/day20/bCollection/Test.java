package day20.bCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/17
 * @Description Collection集合的常用的方法
 */
public class Test {
    public static void main(String[] args) {
        // 1. 实例化一个Collection接口的实现类对象，并向上转型为接口类型
        Collection<String> collection = new ArrayList<>();
        Collection<String> temp = new ArrayList<>();

        // 2. 添加一个元素到集合的末尾
        //    返回值是boolean类型的
        //    如果本次添加操作，对集合中的数据造成影响了。这个数据的确加到集合中了，会返回true。
        //    如果本次添加操作，对集合中的数据没有造成影响，此时会返回false。(Set集合, 因为Set集合是排重的集合, 有时候添加会失败)
        collection.add("lucy");
        collection.add("lily");
        collection.add("polly");
        temp.add("Uncle wang");
        temp.add("polly");
        temp.add("lily");
        temp.add("Li Lei");

        // 3. 批量添加，将一个集合中的所有的元素，添加到当前集合的末尾
        //    返回值boolean
        //    如果本次添加操作，对集合中的数据造成影响了。这个数据的确加到集合中了，会返回true。
        //    如果本次添加操作，对集合中的数据没有造成影响，此时会返回false。(Set集合, 因为Set集合是排重的集合, 有时候添加会失败)
        collection.addAll(temp);

        // 4. 删除集合中从前往后第一个匹配到的元素
        //    返回值boolean
        //    本次删除操作，是否真的删除掉了某些元素。
        //    如果删除掉了，本次操作对集合中的数据造成影响了，返回true。
        //    否则，返回false。(要删除的这个元素在集合中不存在)
        // collection.remove("polly");

        // 5. 批量删除。删除所有的在参数集合中存在的元素
        //    依次判断当前集合中的每一个元素，是否在参数集合中。
        //    如果存在，就删除；如果不存在，就不删除。
        //    返回值boolean
        //    本次操作，如果成功删除掉数据了，对集合中的数据造成影响了，返回true。
        //    否则就返回false。
        // collection.removeAll(temp);

        // 6. 保留当前集合中，存在于参数集合中的数据，删除其他数据。
        //    依次判断当前集合中的每一个元素，是否在参数集合中。
        //    如果存在于参数集合中，就保留这个元素。
        //    如果不存在于参数集合中，就删除这个元素。
        //    返回值boolean
        //    本次操作，如果成功删除掉数据了，对集合中的数据造成影响了，返回true。
        //    否则就返回false。
        // collection.retainAll(temp);

        // 7. 清空集合中的所有的数据
        // collection.clear();

        // 8. 按照条件删除元素
        //    依次将集合中的每一个元素，带入到参数Predicate接口的方法中，作为接口方法的参数
        //    如果Predicate接口的方法返回值为true，就删除这个元素
        //    如果Predicate接口的方法返回值为false，就保留这个元素
        //    返回值boolean
        //    本次操作，如果成功删除掉数据了，对集合中的数据造成影响了，返回true。
        //    否则就返回false。
        // collection.removeIf(ele -> ele.matches("[lL].*"));

        // 9. 判断一个集合中是否包含指定的元素
        boolean ret1 = collection.contains("lily");
        System.out.println(ret1);

        // 10. 判断是否参数集合中的所有元素都在当前集合中包含
        //     只有当参数集合中的每一个元素都在当前集合中包含，才会返回true。
        //     但凡参数集合中有任意的元素没有在当前的集合中包含，返回值都是false。
        boolean ret2 = collection.containsAll(temp);
        System.out.println(ret2);

        // 11. 判断当前的集合中有多少元素，类似于数组的长度
        int size = collection.size();
        System.out.println(size);

        // 12. 判断当前集合，是否是空集合
        boolean ret3 = collection.isEmpty();
        System.out.println(ret3);

        // 13. 将集合中的元素转成Object数组
        Object[] array = collection.toArray();

        // 14. 将集合中的元素转成指定类型的数组
        String[] ret4 = collection.toArray(new String[0]);
        System.out.println(Arrays.toString(ret4));

        System.out.println(collection);
    }
}
