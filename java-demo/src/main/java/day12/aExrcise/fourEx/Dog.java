package day12.aExrcise.fourEx;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/7
 * @Description
 */
public class Dog extends Animal {

    private String furColor;

    public Dog(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public String toString() {
        return "姓名: " + getName() + "，年龄: " + getAge() + ", 毛色: " + getFurColor();
    }
}
