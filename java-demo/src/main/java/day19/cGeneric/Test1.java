package day19.cGeneric;

import java.util.ArrayList;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/16
 * @Description
 */
public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        //
        Object[] array = new Object[10];

        array[0] = "aaa";
        array[1] = 123;
        array[2] = false;

        String ele = (String)array[0];
    }
}
