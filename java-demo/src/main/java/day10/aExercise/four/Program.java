package day10.aExercise.four;


import day10.aExercise.three.BookMark;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/2
 * @Description
 */
public class Program {
    public static void main(String[] args) {



        // 1. 实例化一个数组，长度为5
        BookMark[] bookMarks = {
                new BookMark("四圣试禅心", 15),
                new BookMark("三打白骨精", 25),
                new BookMark("真假美猴王", 35),
                new BookMark("一体拜真如", 45),
                new BookMark("魔主计吞禅", 55)
        };
        // 2. 遍历数组，找出满足要求的元素
        for (BookMark bookMark : bookMarks) {
            // 判断页码是否在指定的范围
            if (bookMark.getPage() >= 20 && bookMark.getPage() <= 50) {
                // 输出书签的信息
                System.out.println(bookMark.info());
            }
        }
    }
}
