package day3.aExercise;

public class Two {
    public static void main(String[] args) {
        // 1. 定义一个int变量，并赋值
        int a = 1000;
        // 2. 将这个int变量的值，给一个byte变量赋值
        byte b = (byte)a;
        // 3. 输出结果
        System.out.println(b);

        /*
            1000: 512+256+128+64+32+8
            0000 0000 0000 0000 0000 0011 1110 1000
            1110 1000
            1001 1000 => -(16+8)
         */
    }
}
