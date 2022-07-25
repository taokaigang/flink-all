package designer.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/8
 * @Description 代理方: 动态代理方，必须实现这个接口
 */
public class DynamicProxy implements InvocationHandler {
    // 实际被代理的对象
    private Object buyer;

    public Object getProxy(Object buyer) {
        this.buyer = buyer;

        /*
         * Proxy: java.lang.reflect.Proxy类，专门用来表示动态代理的类
         * Proxy.newProxyInstance: 获取一个动态代理对象
         *
         * 参数1: ClassLoader: 指定产生代理类的类加载器，需要使用它来指定目标类的类加载器。
         * 参数2: 指定目标类实现的接口
         * 参数3: 指定了InvocationHandler实现类
         */
        return Proxy.newProxyInstance(buyer.getClass().getClassLoader(), buyer.getClass().getInterfaces(), this);
    }

    /**
     * @param proxy 被代理的对象
     * @param method 代理的行为
     * @param args 行为的参数
     * @return 执行的结果
     * @throws Throwable 抛出的异常
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代购走进了AppleStore");
        // 让被代理的对象，执行自己想要执行的逻辑
        return method.invoke(this.buyer, args);
    }
}
