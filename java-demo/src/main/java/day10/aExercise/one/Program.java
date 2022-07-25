package day10.aExercise.one;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/2
 * @Description
 */
public class Program {
    /*
    定义一个网络用户类#要处理的信息有用户ID、用户密码、email地址。在建立类的实例时, 把以上
    三个信息都作为构造函数的参数输入#其中用户ID和用户密码时必须的#缺省的email地址是用户ID加上字符串"@qf.com"
     */
    public static void main(String[] args) {
        User user1 = new User("shawn", "123456", "shawn@163.com");
        User user2 = new User("luds", "1234");

        System.out.println(user1.info());
        System.out.println(user2.info());
    }
}
