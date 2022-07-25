package day29.aExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/29
 * @Description 玩家类
 */
public class User {
    private String name;                // 玩家的姓名
    private List<Poker> pokerList;      // 玩家的手牌

    public String getName() {
        return name;
    }

    public User(String name) {
        this.name = name;
        // 实例化一个集合
        pokerList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return this.name + pokerList;
    }

    /**
     * 获得一张手牌
     * @param poker 手牌
     */
    public void addPoker(Poker poker) {
        // 将手牌添加到自己的集合中即可
        pokerList.add(poker);
        if (pokerList.size() == 17 || pokerList.size() == 20) {
            Collections.sort(pokerList);
        }
    }
}
