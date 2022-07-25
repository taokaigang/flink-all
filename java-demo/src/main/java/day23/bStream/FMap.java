package day23.bStream;

import java.util.Arrays;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/22
 * @Description
 */
public class FMap {
    public static void main(String[] args) {
        String[] strs = {"hello", "world"};

        // 需求：输出每一个组成字符串的字符
        // 直接映射，将流中的元素（字符串），替换成了toCharArray之后的结果（字符数组）
        // 映射完成后，流中的数据依然是两个，分别是两个字符数组
        Arrays.stream(strs).map(String::toCharArray).forEach(ele -> System.out.println(Arrays.toString(ele)));

        // 常用于map直接映射完成后，流中的数据是一个个的容器，而我们需要对容器中的数据进行处理。
        // 此时，可以使用扁平化的映射，将容器中的元素直接存储于一个流中。
        Arrays.stream(strs).map(str -> str.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(System.out::println);
    }
}
