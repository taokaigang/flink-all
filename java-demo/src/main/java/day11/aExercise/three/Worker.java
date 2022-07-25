package day11.aExercise.three;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/3
 * @Description
 */
public class Worker extends Person {
    private String company;
    private int workAge;

    public Worker() {
    }

    public Worker(String name, int age, char gender, String country, String company, int workAge) {
        super(name, age, gender, country);
        this.company = company;
        this.workAge = workAge;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    @Override
    public void work() {
        System.out.println(this.getName() + "在搬砖...");
    }
}
