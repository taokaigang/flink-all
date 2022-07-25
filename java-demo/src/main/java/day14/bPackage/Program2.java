package day14.bPackage;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/9
 * @Description
 *      自动的装箱和拆箱不能完成的逻辑：
 */
public class Program2 {
    public static void main(String[] args) {
        // 此时，10会最优先匹配到int类型的参数
        show(10);
        show(Integer.valueOf(10));
    }
    public static void show(int a) {
        System.out.println(a);
    }
    public static void show(Integer a) {
        System.out.println(a);
    }
}
