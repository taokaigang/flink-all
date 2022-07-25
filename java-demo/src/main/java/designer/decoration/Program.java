package designer.decoration;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/8
 * @Description
 */
public class Program {
    public static void main(String[] args) {
        MyString myString = new MyString("hello");
        myString.show();
    }
}

// 小案例：可以设计一个对字符串String类进行功能拓展的类
//        可以在类内维护一个字符串对象，表示要操作的对象是谁
//        除此之外，还可以添加其他的功能，实现间接的对字符串进行功能拓展
class MyString {
    private String str; // 需要操作的字符串
    public MyString(String str) {
        this.str = str;
    }
    public void show() {
        System.out.println(str + "!");
    }
}
