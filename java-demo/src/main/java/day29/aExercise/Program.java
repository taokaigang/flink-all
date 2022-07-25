package day29.aExercise;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/29
 * @Description 斗地主发牌
 */
public class Program {
    public static void main(String[] args) {
        // 1. 准备玩家
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎使用JJ斗地主");
        System.out.println("请输入三个玩家的姓名: ");
        User[] users = new User[3];
        for (int i = 0; i < 3; i++) {
            String username = scanner.nextLine();
            // 实例化对象，存入数组
            users[i] = new User(username);
        }

        // 2. 准备牌堆
        PokerList pokerList = new PokerList();

        // 3. 发牌
        fillPoker(pokerList, users);

        // 4. 展示手牌
        showUsers(users);

        // 5. 叫地主
        User lord = getLord(users);

        // 6. 将地主牌添加到玩家手中
        StringBuilder builder = new StringBuilder("地主牌: ");
        for (int i = 0; i < 3; i++) {
            Poker poker = pokerList.get();
            // 将地主牌信息记录下来
            builder.append(poker).append(", ");
            // 将地主牌添加到地主手中
            lord.addPoker(poker);
        }
        builder.delete(builder.length() - 2, builder.length());

        // 7. 最终效果展示
        System.out.println(builder);
        showUsers(users);

        // 8.
        save(users);
    }

    private static void save(User[] users) {
        try(PrintStream ps = new PrintStream(new FileOutputStream("file\\day29\\log", true))) {
            ps.println("--------------------");
            Arrays.stream(users).forEach(ps::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 获取地主
    private static User getLord(User[] users) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("谁叫地主？");
            String username = scanner.nextLine();
            for (User user : users) {
                if (user.getName().equalsIgnoreCase(username.trim())) {
                    return user;
                }
            }
        }
    }

    private static void showUsers(User[] users) {
        for (User user : users) {
            System.out.println(user);
        }
    }

    // 发牌
    private static void fillPoker(PokerList pokerList, User[] users) {
        for (int i = 0; i < 51; i++) {
            users[i % 3].addPoker(pokerList.get());
        }
    }
}
