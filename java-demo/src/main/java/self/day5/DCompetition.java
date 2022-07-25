package self.day5;

/**
 * 4. 某数学竞赛中，参赛⼈数⼤约在380~450⼈之间。⽐赛结果，全体考⽣的总平均分为76分，男⽣
 * 的平均分为75分，⼥⽣的平均分为80.1分，求男⼥⽣各有多少⼈
 */
public class DCompetition {
    public static void main(String[] args) {
//        for (int i = 380; i <= 450; i++) {
//            for (int j = 0; j <= 450; j++) {
//                if (76 * (i + j) == (75 * i + 80.1 * j)) {
//                    System.out.println("男生有" + i + "人");
//                    System.out.println("女生有" + j + "人");
//                }
//            }
//        }
        for (int total = 380; total <=450 ; total++) {
            for (int male = 1; male < total; male++) {
                int female=total-male;
                if(male*75+female*80.1==total*76){
                    System.out.println("男生："+male+"女生"+female);
                }
            }
        }


    }
}
