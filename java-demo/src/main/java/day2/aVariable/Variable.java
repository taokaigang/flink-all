package day2.aVariable;

/**
 * 变量、常量的定义（以int类型举例）
 */
public class Variable {
    public static void main(String[] args) {
        // 1. 定义一个变量，此时这个变量暂时没有赋值。
        //    此时，变量未赋值，无法直接使用。 Variable 'a' might not have been initialized。
        int a;
        //    给这个变量赋值，将等号右边的值，给左边的变量赋值。
        a = 10;
        System.out.println(a);

        // 2. 同时定义多个相同类型的变量，此时这三个变量都没有值。
        int b, c, d;
        b = 20;
        c = 30;

        // 3. 定义一个变量的同时，给这个变量赋初始值。
        int e = 10;

        // 4. 定义多个相同类型的变量，同时给某一些变量初始值。
        int f, g = 20, h = 11, i;
        g = 30;
        System.out.println(g);

        // 5. 定义一个常量，定义的同时，赋初始值。
        //    常量值一旦确定，将不能发生改变。 Cannot assign a value to final variable 'j'。
        final int j = 30;

        // 6. 常量也允许先定义，后赋值。但是，赋值只能进行一次，一旦第一次赋值完成，值将不能再修改。
        final int k;
        k = 100;
    }
}
