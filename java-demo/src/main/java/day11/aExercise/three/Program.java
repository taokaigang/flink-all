package day11.aExercise.three;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/3
 * @Description
 */
public class Program {
    /*
         定义一个人类，包括属性：姓名、性别、年龄、国籍；包括方法：吃饭、睡觉，工作。
        （1）根据人类，派生一个学生类，增加属性：学校、学号；重写工作方法（学生的工作是学习）。
        （2）根据人类，派生一个工人类，增加属性：单位、工龄；重写工作方法（工人的工作是……自己想吧）。
        （3）根据学生类，派生一个学生干部类，增加属性：职务；增加方法：开会。
        （4）编写主函数分别对上述3类具体人物进行测试。
     */
    public static void main(String[] args) {
        // 实例化一个学生对象
        Student xiaoming = new Student("小明", 10, '男', "中国", "光明一小", "001");
        xiaoming.work();

        // 实例化一个学生干部对象
        StudentMonitor xiaobai = new StudentMonitor("江小白", 13, '男', "中国", "前进中学", "002", "班长");
        xiaobai.work();
        xiaobai.meeting();

        // 实例化一个工人对象
        Worker worker = new Worker("老白", 43, '男', "中国", "老白酒业", 20);
        worker.work();
    }
}
