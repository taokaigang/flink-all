package day14.bPackage;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/9
 * @Description
 *      借助 int、Integer 完成装箱和拆箱（包含手动和自动）
 */
public class Program1 {
    public static void main(String[] args) {
        unpack();
    }

    // 享元原则
    private static void data() {
        // 1. 装箱
        Integer i1 = new Integer(10);
        Integer i2 = Integer.valueOf(10);

        System.out.println(i1.equals(i2));  // 比较的是包装起来的基本数据类型的值
        System.out.println(i1 == i2);       // 比较的是地址
        System.out.println("------------");
        // 2.
        Integer i3 = Integer.valueOf(10);
        Integer i4 = Integer.valueOf(10);
        System.out.println(i3 == i4);

        Integer i5 = Integer.valueOf(1000);
        Integer i6 = Integer.valueOf(1000);
        System.out.println(i5 == i6);

        System.out.println(Integer.valueOf(128) == Integer.valueOf(128));
    }

    // 装箱的演示
    private static void pack() {
        // 1. 通过包装类的构造方法完成
        // Byte n1 = new Byte((byte)1);
        // Short n2 = new Short((short)2);
        // Integer n3 = new Integer(3);
        // Long n4 = new Long(4L);
        // Float n5 = new Float(3.14f);
        // Double n6 = new Double(3.14);
        // Character n7 = new Character('a');
        // Boolean n8 = new Boolean(false);

        // 2. 使用静态方法 valueOf
        Byte n1 = Byte.valueOf((byte)1);
        Short n2 = Short.valueOf((short)2);
        Integer n3 = Integer.valueOf(3);
        Long n4 = Long.valueOf(4);
        Float n5 = Float.valueOf(3.14f);
        Double n6 = Double.valueOf(3.14);
        Character n7 = Character.valueOf('a');
        Boolean n8 = Boolean.valueOf(true);
    }

    // 拆箱的演示
    private static void unpack() {

        Byte i1 = Byte.valueOf((byte) 100);
        byte n1 = i1.byteValue();

        Short i2 = Short.valueOf((short) 100);
        short n2 = i2.shortValue();

        Integer i3 = Integer.valueOf(100);
        int n3 = i3.intValue();

        Long i4 = Long.valueOf(100);
        long n4 = i4.longValue();

        Float i5 = Float.valueOf(3.14f);
        float n5 = i5.floatValue();

        Double i6 = Double.valueOf(3.14);
        double n6 = i6.doubleValue();

        Character i7 = Character.valueOf('a');
        char n7 = i7.charValue();

        Boolean i8 = Boolean.valueOf(true);
        boolean n8 = i8.booleanValue();
    }

    private static void unpack2() {
        Integer i = Integer.valueOf(100);

        byte b = i.byteValue();

    }

    // 自动的装箱和拆箱
    private static void auto() {
        // 自动装箱：由一个基本数据类型，到对应的包装类型的转换。只需要一个赋值语句即可完成。
        Integer i1 = 10;
        // 自动拆箱：由一个包装类型，到对应的基本数据类型的转换。只需要一个赋值语句即可完成。
        int a = i1;



    }

}
