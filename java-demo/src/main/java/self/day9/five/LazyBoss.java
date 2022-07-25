package self.day9.five;


public class LazyBoss {
    // 1. 私有化构造方法，杜绝了从外面通过new的方式进行实例化的可能性。
    private LazyBoss(){

    }
    // 2. 声明一个私有的、静态的、当前类的对象
    private static LazyBoss Instance;
    // 3. 提供一个可以给外界返回当前类对象的方法。堆到跟前了
    public static LazyBoss getInstance() {
        if (Instance == null) {
            Instance = new LazyBoss();
        }
        return Instance;
    }

}
