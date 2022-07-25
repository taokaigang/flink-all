package day10.binheritance.two.a;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/2
 * @Description
 */
public class Animal {
    private int privateField;       // 私有权限的属性
    int defaultField;               // 默认权限的属性
    protected int protectedField;   // 保护权限的属性
    public int publicField;         // 公共权限的属性

    public void test() {
        // 在当前的类中，这四个权限的属性都可以访问
        this.privateField = 1;
        this.defaultField = 1;
        this.protectedField = 1;
        this.publicField = 1;
    }
}
