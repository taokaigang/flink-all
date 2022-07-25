package day10.aExercise.five;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/2
 * @Description
 *      懒汉式单例：声明静态当前类对象的时候，不去进行实例化。
 *                什么时候外面需要获取这个对象了，再实例化。
 */
public class Chairman {
    // 1. 私有化构造方法，目的：杜绝从外面通过new的方式实例化对象的可能性。
    private Chairman() {
        System.out.println("一个Chairman对象被实例化了");
    }
    // 2. 私有的、静态的、当前类的对象。
    //    因为这个属性是静态的，空间开辟发生在类第一次加载到内存的时候。
    //    类第一次加载到内存，程序在运行的过程中，只会触发一次。
    //    所以此时，instance只会实例化一次。
    private static Chairman instance;
    // 3. 提供一个public权限的、静态的方法，用于获取当前类的对象。
    //    是类外获取这个类唯一的对象的入口。
    public static Chairman getInstance() {
        // 返回这个类的唯一的对象
        // 即，每次调用这个方法，返回的对象，应该是同一个。
        if (instance == null) {
            instance = new Chairman();
        }
        return instance;
    }
}
