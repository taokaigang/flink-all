package self.day22.aExercise.two;


public class Staff implements Comparable<Staff> {
    private String name;
    private Integer age;
    private Integer seniority;
    private Integer salary;

    public Staff(String name, Integer age, Integer seniority, Integer salary) {
        this.name = name;
        this.age = age;
        this.seniority = seniority;
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getSeniority() {
        return seniority;
    }

    public Integer getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", seniority=" + seniority +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Staff o) {
        if (this.age != o.age){
            return this.age-o.age;
        }
        else if (this.seniority != o.seniority){
            return o.seniority-this.seniority;
        }
        return o.salary-this.salary;
    }
}
