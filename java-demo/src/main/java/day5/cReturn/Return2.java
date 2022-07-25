package day5.cReturn;

public class Return2 {
    // return:
    //      1. 后面跟上一个值，表示这个方法的返回值。
    //      2. 表示结束一个方法，return后面的所有语句都不执行。
    //
    // 在返回值类型为void的方法中，能不能使用return关键字？
    //      1. 可以。此时return后面什么都不写，直接写分号结束。
    //      2. 此时的return，仅表示结束一个方法。
    //
    // 如果一个方法中涉及到了分支结构，必须保证每一个分支上都有结果返回。

    public static void main(String[] args) {

    }

    static int calculate2(int a, int b) {
        if (a > b) {
            return 1;
        }
        else if (a == b) {
            return 0;
        }
        else {
            return  -1;
        }
        // 程序没有那么智能，不会检测你的主观逻辑
        // 程序的逻辑很简单，只要你写了if，就默认应该还有else的情况
    }

    static int calculate(int a, int b) {
        if (a > b) {
            return a - b;
        }
        else {
            return b - a;
        }
    }

    static int add(int a, int b) {
        // System.out.println("a + b = " + (a + b));
        return a + b;
    }
}
