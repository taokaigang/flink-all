package self.day20.aExercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Four {
    /**
     * 4. 【简】设计一个方法，在一个存储了若干个视频的集合中，删除所有的以 .mp4 结尾的元素
     * @param args
     */
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<>();
        coll.add("西红柿首富.mp4");
        coll.add("当幸福来敲门.mkv");
        coll.add("复仇者联盟.qlv");
        coll.add("美国队长.mkv");
        coll.add("机器人总动员.mp4");
        coll.add("你的名字mp4");

        coll.removeIf(ele->ele.matches(".*\\.mp4"));

        Iterator<String> iterator=coll.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
