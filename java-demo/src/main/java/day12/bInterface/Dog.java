package day12.bInterface;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/7
 * @Description
 */
public class Dog extends Animal implements Runnable {

    public void breakHouse() {
        System.out.println("拆家");
    }

    @Override
    public void bark() {
        System.out.println("Dog Bark~");
    }

    @Override
    public void run() {
        System.out.println("Dog Run");
    }
}
