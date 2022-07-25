package self.day17.aExercise;


public class Three {
    /**
     * 3.【简】设计一个方法，将一个字符串中的大小写字母翻转。
     * @param args
     */
    public static void main(String[] args) {
        String str="AaBbCcDdEe";
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if('a'<=chars[i] && chars[i]<='z'){
                chars[i] -= 32;
            }else if('A'<=chars[i] && chars[i]<='Z'){
                chars[i] +=32;
            }
        }
        String str2=String.valueOf(chars);
        System.out.println(str2);
    }
}
