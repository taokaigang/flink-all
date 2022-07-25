package self.day10.one;

public class E {
    /**
     * 1.# 编写一个Java程序，满足如下要求：
     *      1.# 编写一个 Car 类，具有：
     *          1.# 属性:#品牌(mark)#-#String类型
     *          2.# 功能:#驾驶#void#drive()
     *     2.# 定义 Car 类的子类 SubCar ，具有：
     *      1.# 属性:#价格(price)、速度(Speed)#-#int类型
     *      2.# 功能:#变速#void#speedChange(int#newSpeed)，把新速度赋值给#speed
     *     3.# 定义主类E，在其main方法中创建SubCar类的两个对象：aodi和benchi的对象并测试其对象的特
     * 性。
     * @param args
     */
    public static void main(String[] args) {

        SubCar aodi=new SubCar("aodi",20000,260);
        SubCar benchi=new SubCar("beichi",21000,280);
        System.out.println(aodi.toString());
        System.out.println(benchi.toString());

        System.out.println(aodi.getMark());
        System.out.println(aodi.getPrice());
        System.out.println(aodi.getSpeed());

        System.out.println(benchi.getMark());
        System.out.println(benchi.getPrice());
        System.out.println(benchi.getSpeed());


    }
}
