package day16.bEnum;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/13
 * @Description
 */
public enum Gender {
    Male, Female;

    // 1. 在枚举中定义属性、方法、构造方法... 是需要写在枚举元素的下方！
    //    如果需要在枚举中定义成员，需要在最后一个枚举元素后面添加一个分号。
    public String desc;

    // 2. 定义方法
    public void show() {
        System.out.println("枚举中的方法定义");
    }
    public static void display() {
        System.out.println("枚举中的静态方法的定义");
    }
}

class Test1 {
    public static void main(String[] args) {
        // 属性访问
        Gender gender = Gender.Male;
        gender.desc = "";
        System.out.println(gender.desc);

        gender.show();
        Gender.display();
    }
}
