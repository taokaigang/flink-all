package day21.aExercise.four;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/20
 * @Description 删除一个存有若干视频名字的集合中，所有的 .mp4、.avi、.rmvb 格式的视频
 */
public class Extends {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "");
        // 条件删除
        list.removeIf(ele -> ele.matches(".*\\.(mp4|avi|rmvb)"));
    }
}
