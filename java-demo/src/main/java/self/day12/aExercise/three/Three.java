package self.day12.aExercise.three;

public class Three {
    /**
     * 3. 【中】利用接口做参数，写个计算器，能完成加减乘除运算
     *      1. 定义⼀个接口Compute，含有⼀个计算方法int compute(int a,int b)
     *      2. 设计⼀个类UseCompute，含有方法public void useCom(Compute com,int one,int two)，此方法
     *        能够用传递过来的对象调用compute方法完成运算，并输出计算的结果。
     *      3. 设计⼀个主类Test，调用UseCompute中的方法useCom来完成加减乘除运算。
     * @param args
     */
    public static void main(String[] args) {

        UseCompute uc=new UseCompute();
        //加法
        uc.useCom(new Compute() {
            @Override
            public int compute(int a, int b) {
                return a+b;
            }
        },20,10);

        //减法
        uc.useCom(new Compute() {
            @Override
            public int compute(int a, int b) {
                return a-b;
            }
        },20,10);

        //乘法
        uc.useCom(new Compute() {
            @Override
            public int compute(int a, int b) {
                return a*b;
            }
        },20,10);

        //除法
        uc.useCom(new Compute() {
            @Override
            public int compute(int a, int b) {
                try {
                    return a/b;
                }catch (ArithmeticException exc){
                    System.out.println("除数不能为零");
                }
                return -1;
            }
        },20,10);

    }
}
