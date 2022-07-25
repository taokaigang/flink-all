package day6.aExercise;

public class Four {
    // 某数学竞赛中，参赛⼈数⼤约在380~450⼈之间。
    // ⽐赛结果，全体考⽣的总平均分为76分，
    // 男⽣的平均分为75分，⼥⽣的平均分为80.1分，
    // 求男⼥⽣各有多少⼈？
    public static void main(String[] args) {
        // 1. 外层循环，遍历总人数
        for (int total = 380; total <= 450; total++) {
            // 2. 内层循环遍历男生人数
            for (int male = 1; male < total; male++) {
                // 3. 计算女生的人数
                int female = total - male;
                // 4. 成绩判断
                if (male * 75 + female * 80.1 == total * 76) {
                    System.out.println("男生: " + male + "人，女生: " + female + "人。");
                }
            }
        }
    }
}
