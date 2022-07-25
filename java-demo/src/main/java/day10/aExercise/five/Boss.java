package day10.aExercise.five;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/2
 * @Description
 *      饿汉式单例：无论外面有没有使用到这个单例类的对象，直接在内存中，先把这个对象实例化好了。
 */
public class Boss {
    // 1. 私有化构造方法，目的：杜绝从外面通过new的方式实例化对象的可能性。
    private Boss() {
        System.out.println("一个Boss对象被实例化了");
    }
    // 2. 私有的、静态的、当前类的对象，并实例化。
    //    因为这个属性是静态的，空间开辟发生在类第一次加载到内存的时候。
    //    类第一次加载到内存，程序在运行的过程中，只会触发一次。
    //    所以此时，instance只会实例化一次。
    private static Boss instance = new Boss();//类加载时实例化 声明时实例化
    // 3. 提供一个public权限的、静态的方法，用于获取当前类的对象。
    //    是类外获取这个类唯一的对象的入口。
    public static Boss getInstance() {
        // 返回这个类的唯一的对象
        // 即，每次调用这个方法，返回的对象，应该是同一个。
        return instance;
    }
}
