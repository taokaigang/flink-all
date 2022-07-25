package day21.aExercise.four;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/20
 * @Description 设计一个方法，在一个存储了若干个视频的集合中，删除所有的以 .mp4 结尾的元素。
 */
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "");
        // 条件删除
        // list.removeIf(ele -> ele.endsWith(".mp4"));
        list.removeIf(ele -> ele.matches(".*\\.mp4"));
    }
}
