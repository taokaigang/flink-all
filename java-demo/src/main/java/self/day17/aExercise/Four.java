package self.day17.aExercise;

import java.util.Random;

public class Four {
    /**
     * 4.【难】给定一个长度，生成一个指定长度的字符串，这个字符串由随机的字母、数字或下划线组
     *      成。(不用必须同时包含字母、数字、下划线)
     *      randomString(5) -> hi2Pd
     * @param args
     */
    public static void main(String[] args) {
        String string = randomString(5);
        System.out.println(string);
    }
    private static String randomString(int number){
        Random random=new Random();
        String str="";
        for (int i = 0; i < number; i++) {
            char[] ch={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
                        'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
                        '_'};
            int j = random.nextInt(54);
            str +=ch[j];
        }
        return str;
    }
}
