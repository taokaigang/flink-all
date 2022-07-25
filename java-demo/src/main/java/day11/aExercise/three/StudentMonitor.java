package day11.aExercise.three;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/3
 * @Description
 */
public class StudentMonitor extends Student {
    private String job;

    public StudentMonitor() {
    }

    public StudentMonitor(String name, int age, char gender, String country, String school, String id, String job) {
        super(name, age, gender, country, school, id);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void meeting() {
        System.out.println("学生干部: " + this.job + this.getName() + "在开会中...");
    }

}
