package day16.bEnum;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/13
 * @Description
 */
public class Test2 {

    // 为了防止和当前包中的Gender枚举重复，在这里写成了静态内部枚举
    private static enum Gender implements MyInterface {
        // 其实，所谓枚举中的元素，其实就是一个静态的、当前类的对象。
        Male("男") {
            // 这里，其实就相当于是一个匿名内部类
            // 在这里，可以重写Gender中的方法
            @Override
            public void test() {
                System.out.println("Male的重写实现");
            }
        },Female("女");
        // 添加属性
        private String desc;
        // 添加构造方法，为这个属性赋值
        // 在枚举中定义构造方法，一般情况下，只是在当前的枚举中使用
        // 所以，枚举的构造方法，一般情况下，权限都是私有的
        Gender(String desc) {
            this.desc = desc;
        }

        @Override
        public String toString() {
            return this.desc;
        }

        @Override
        public void test() {
            System.out.println("接口中的方法");
        }
    }

    private static interface MyInterface {
        void test();
    }

    public static void main(String[] args) {
        // 1. 枚举对象的获取
        Gender gender = Gender.Male;
        System.out.println(gender);

        System.out.println(Gender.Female);

        Gender.Male.test();
        Gender.Female.test();
    }
}

