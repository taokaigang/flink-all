package day5.bParameter;

/**
 * 参数里面的坑：
 */
public class Parameter2 {
    public static void main(String[] args) {

        // int x = 10;
        // change(x);
        // System.out.println(x);

        int x = 10, y = 20;
        swap(x, y);
        System.out.println("x = " + x + ", y = " + y);
    }

    static void swap(int x, int y) {
        int tmp = x;
        x = y;
        y = tmp;
    }

    static void change(int x) {
        x = 20;
    }
}
