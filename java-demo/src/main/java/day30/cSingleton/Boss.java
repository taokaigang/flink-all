package day30.cSingleton;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/30
 * @Description 单例类
 */
public class Boss {
    // 1. 私有化构造方法，杜绝在外界通过new进行实例化的可能性
    private Boss() {
        System.out.println("一个Boss对象被实例化了");
    }
    // 2. 提供一个private权限的、静态的、当前类的对象
    private static Boss Instance = null;
    // 3. 提供一个public权限的、静态的、获取当前类对象的方法
    public static synchronized Boss getInstance() {
        if (Instance == null) {
            Instance = new Boss();
        }
        return Instance;
    }
}
