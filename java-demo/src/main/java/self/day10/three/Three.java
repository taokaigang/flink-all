package self.day10.three;

public class Three {
    /**
     * 3.# 定义一个人类，包括属性：姓名、性别、年龄、国籍；包括方法：吃饭、睡觉，工作。
     * （1）根据人类，派生一个学生类，增加属性：学校、学号；重写工作方法（学生的工作是学习）。
     * （2）根据人类，派生一个工人类，增加属性：单位、工龄；重写工作方法（工人的工作是……自己想
     * 吧）。
     * （3）根据学生类，派生一个学生干部类，增加属性：职务；增加方法：开会。
     * （4）编写主函数分别对上述3类具体人物进行测试。
     * @param args
     */
    public static void main(String[] args) {
        Student student=new Student("小明","男",18,"中国",
                "清华",202001);
       Worker worker=new Worker("大锤","男",25,"中国",
               "xxx",5);
       StudentCadre studentCadre=new StudentCadre("小红","女",18,"中国",
               "清华",202001,"班长");

        System.out.println(student.toString());
       student.eat();
       student.sleep();
       student.work();
        System.out.println("=============");
        System.out.println(worker.toString());
        worker.eat();
        worker.sleep();
        worker.work();
        System.out.println("=============");
        System.out.println(studentCadre.toString());
        studentCadre.eat();
        studentCadre.sleep();
        studentCadre.work();
        studentCadre.conference();

    }
}
