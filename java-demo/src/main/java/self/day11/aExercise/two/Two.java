package self.day11.aExercise.two;

public class Two {
    /**
     * 2.# （难）利用接口做参数，写个计算器，能完成加减乘除运算
     *      1. 定义⼀个接口Compute，含有⼀个计算方法int compute(int a,int b)
     *      2. 设计⼀个类UseCompute，含有方法public void useCom(Compute com,int one,int two)，此方法
     *        能够用传递过来的对象调用compute方法完成运算，并输出计算的结果。
     *      3. 设计⼀个主类Test，调用UseCompute中的方法useCom来完成加减乘除运算。
     * @param args
     */
    public static void main(String[] args) {
        UseCompute uc=new UseCompute();
        uc.useCom(new AddImpl(),4,2);
        uc.useCom(new SubImpl(),4,2);
        uc.useCom(new MulImpl(),4,2);
        uc.useCom(new DivImpl(),4,2);
    }
}
