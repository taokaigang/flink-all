package day9.fsingleton;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/1
 * @Description 懒汉式单例
 */
public class Chairman {
    // 1. 私有化构造方法，杜绝了从外面通过new的方式进行实例化的可能性。
    private Chairman() {
        System.out.println("一个Chairman对象被实例化了");
    }
    // 2. 声明一个私有的、静态的、当前类的对象
    private static Chairman Instance;
    // 3. 提供一个可以给外界返回当前类对象的方法。
    public static Chairman getInstance() {
        if (Instance == null) {
            Instance = new Chairman();
        }
        return Instance;
    }
}
