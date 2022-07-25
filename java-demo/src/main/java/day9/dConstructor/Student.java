package day9.dConstructor;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/1
 * @Description
 */
public class Student {
    /*
        类加载的时机：
            1. 实例化对象的时候会加载类
            2. 访问静态成员的时候会加载类
     */
    static {
        System.out.println("静态代码段");
        System.out.println("类加载的时候执行");
        System.out.println("静态代码段，只会执行一次");
    }

    // 对象的生命周期：
    //    一个对象从最开始被实例化完成，到最后销毁，中间经历的过程。
    //    起点：构造方法。
    //    终点：析构方法。一个对象在被销毁之前，最后一次调用的方法。
    @Override
    protected void finalize() throws Throwable {
        System.out.println("我就要被销毁了，这是我说的最后一句话...");
        super.finalize();
    }
}
