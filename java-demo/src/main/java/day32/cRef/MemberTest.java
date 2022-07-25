package day32.cRef;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/7
 * @Description 成员的访问
 */
public class MemberTest {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("day32.cRef.Person");
            Object o = cls.newInstance();

            // 1. 方法的获取
            Method show1 = cls.getDeclaredMethod("show", int.class, int.class, int.class);
            show1.setAccessible(true);
            // 2. 调用方法, 第一个参数，是调用这个方法的对象
            //    invoke方法，可以调用指定的方法，并且这个方法的返回值，就是调用的这个方法的返回值
            Object invoke = show1.invoke(null, 1, 2, 3);
            System.out.println(invoke);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 1. 属性的获取和访问
     */
    private static void member1() {
        try {
            // 1. 获取用来描述Person类的Class对象
            Class<?> cls = Class.forName("day32.cRef.Person");
            // 2. 实例化一个对象
            Object obj = cls.newInstance();
            // 3. 通过属性的名字获取属性
            Field name = cls.getDeclaredField("b");
            name.setAccessible(true);
            // 3.1. 设置这个属性的值
            //      参数obj: 对于静态成员，这里可以任意写，但是一般情况下，会使用null
            //      参数value: 代表设置给name的值是什么
            name.set(null, 1);
            // 3.2. 获取这个属性的值
            //      参数obj: 代表需要获取哪一个对象的name属性值
            System.out.println(name.get(null));
            System.out.println(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
