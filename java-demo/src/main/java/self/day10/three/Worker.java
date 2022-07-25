package self.day10.three;
//2）根据人类，派生一个工人类，增加属性：单位、工龄；重写工作方法（工人的工作是……自己想吧）。
public class Worker extends Person {
    String unit;
    int seniority;

    public Worker() {
    }

    public Worker(String name, String gender, int age, String nationality, String unit, int seniority) {
        super(name, gender, age, nationality);
        this.unit = unit;
        this.seniority = seniority;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "unit='" + unit + '\'' +
                ", seniority=" + seniority +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                '}';
    }

    @Override
    void work() {
        System.out.println("工人的工作是搬砖");
    }
}
