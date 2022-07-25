package day32.cRef;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/7
 * @Description 通过反射进行对象的实例化
 */
public class InstitateTest {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("day32.cRef.Person");
            // 获取指定的构造方法
            Constructor<?> constructor = cls.getDeclaredConstructor(String.class, int.class);
            // 获取一个成员的修饰符
            int modifiers = constructor.getModifiers();
            System.out.println(modifiers);
            // 通过这个方法，将一个数字的权限拆解成可读的字符串表示形式
            String s = Modifier.toString(modifiers);
            System.out.println(s);

            // 获取一个构造方法的参数列表
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            System.out.println(Arrays.toString(parameterTypes));

            // 获取一个构造方法的异常抛出类型列表
            Class<?>[] exceptionTypes = constructor.getExceptionTypes();
            System.out.println(Arrays.toString(exceptionTypes));

        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    /**
     * 4. 一个类中所有的构造方法的获取
     */
    private static void init4() {
        try {
            Class<?> cls = Class.forName("day32.cRef.Person");
            // 获取一个类中所有的构造方法(只能获取访问权限足够的构造方法)
            // Constructor<?>[] constructors = cls.getConstructors();
            // 获取一个类中所有的构造方法(可以获取任意权限的构造方法)
            Constructor<?>[] constructors = cls.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.println(constructor);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 3. 使用访问权限不足的构造方法进行对象实例化
     */
    private static void init3() {
        try {
            // 1. 获取用来描述Person类的Class对象
            Class<?> cls = Class.forName("day32.cRef.Person");
            // 2. 获取指定参数列表的构造方法, 在参数中指定不同的参数类型。
            Constructor<?> constructor = cls.getDeclaredConstructor(String.class);
            // 3. 忽略权限校验，直接进行成员访问
            constructor.setAccessible(true);
            // 4. 对象的实例化, 参数就是构造方法对应的实参
            Object obj = constructor.newInstance("xiaoming");
            System.out.println(obj);

        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    /**
     * 2. 使用访问权限足够的构造方法进行对象实例化
     */
    private static void init2() {
        try {
            // 1. 获取用来描述Person类的Class对象
            Class<?> cls = Class.forName("day32.cRef.Person");
            // 2. 获取指定参数列表的构造方法, 在参数中指定不同的参数类型。
            Constructor<?> constructor = cls.getConstructor(String.class, int.class);
            // 3. 对象的实例化, 参数就是构造方法对应的实参
            Object obj = constructor.newInstance("xiaoming", 10);
            System.out.println(obj);

        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    /**
     * 1. 直接通过newInstance进行对象的实例化
     */
    private static void init1() {
        try {
            // 1. 先获取到用来描述Person类的Class对象。
            Class<?> cls = Class.forName("day32.cRef.Person");
            // 2. 直接通过newInstance进行对象的实例化
            //    通过类中的无参构造方法进行的实例化
            Object o = cls.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
