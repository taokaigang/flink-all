package day23.aExercise.two;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/22
 * @Description
 */
public class Employee implements Comparable<Employee> {
    private String name;
    private int age;
    private int workAge;
    private int salary;

    public Employee(String name, int age, int workAge, int salary) {
        this.name = name;
        this.age = age;
        this.workAge = workAge;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWorkAge() {
        return workAge;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", workAge=" + workAge +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        // 如果年龄不同，按照年龄进行升序排序
        if (this.age != o.age) {
            return this.age - o.age;
        }
        // 如果工龄不同，按照工龄进行降序排序
        else if (this.workAge != o.workAge) {
            return o.workAge - this.workAge;
        }
        // 按照薪资降序
        else if (this.salary != o.salary) {
            return o.salary - this.salary;
        }

        return 1;
    }
}
