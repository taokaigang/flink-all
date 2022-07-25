package day13.elambdaSyntax3;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/8
 * @Description
 */
public class Syntax {
    public static void main(String[] args) {
        // 如果对于这个方法的实现逻辑，是为了获取到对象的名字
        // GetField field = person -> person.getName();
        // 对于对象方法的特殊引用
        GetField field = Person::getName;

        // 如果对于这个方法的实现逻辑，是为了给对象的某些属性进行赋值
        // SetField lambda = (person, name) -> person.setName(name);
        SetField lambda = Person::setName;

        // 如果对于这个方法的实现逻辑，正好是参数对象的某一个方法
        // ShowTest lambda2 = person -> person.show();
        ShowTest lambda2 = Person::show;
    }
}

interface ShowTest {
    void test(Person person);
}

interface SetField {
    void set(Person person, String name);
}

interface GetField {
    String get(Person person);
}
