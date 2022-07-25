package self.day9.one;

public class One {
    /**
     * 1. （易）定义一个网络用户类要处理的信息有用户ID、用户密码、email地址。在建立类的实例时把以上
     * 三个信息都作为构造函数的参数输入其中用户ID和用户密码时必须的缺省的email地址是用户ID加
     * 上字符串"@qf.com"
     * @param args
     */
    public static void main(String[] args) {

        NetworkUser user= new NetworkUser(123,123);
        NetworkUser user2=new NetworkUser(456,456,"456@qq.com");

        System.out.println(user.ID);
        System.out.println(user.password);
        System.out.println(user.email);
        System.out.println("=====================");
        System.out.println(user2.ID);
        System.out.println(user2.password);
        System.out.println(user2.email);
    }
}
