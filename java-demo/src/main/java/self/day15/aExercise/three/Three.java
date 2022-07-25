package self.day15.aExercise.three;

import java.util.Scanner;

public class Three {
    /**
     * 3. 设计一个剪刀石头布的小游戏
     *     1. 用户从控制台输入选择:1.剪刀2.石头3.布
     *     2. 随机生成一个系统的选择
     *     3. 输出判定结果
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("选择:1.剪刀2.石头3.布");
        int i = scanner.nextInt();
        String choice = Choice(i);
        RandomChoice randomChoice=new RandomChoice();
        String shuffle = randomChoice.shuffle();
        System.out.println("机选："+shuffle);
        boolean judge = judge(choice, shuffle);
        System.out.println(judge);

    }
    private static String Choice(int number){
        if (number==1){
            return "剪刀";
        }else if (number==2){
            return "石头";
        }else if (number==3){
            return "布";
        }else {
            return "输入错误！";
        }
    }

    private static boolean judge(String a,String b){
        if (a.equals(b)){
            return true;
        }else {
            return false;
        }
    }
}
