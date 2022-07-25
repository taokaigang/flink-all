package self.day17.aExercise;

public class Five {
    /**
     * 5. 将一个字符串中最后一次出现的指定字符替换成大小写翻转的字符。
     *      replace("hello", 'l') -> helLo
     *      replace("HELLO", 'L') -> HELlO
     * @param args
     */
    public static void main(String[] args) {
        String replace1 = replace("hello", 'l');
        String replace2 = replace("HELLO", 'L');
        System.out.println(replace1);
        System.out.println(replace2);

    }
    private static String replace(String str,char ch){
        int i = str.lastIndexOf(ch);
        char[] chars = str.toCharArray();
        if('a'<=chars[i] && chars[i]<='z'){
            chars[i] -= 32;
        }else if('A'<=chars[i] && chars[i]<='Z'){
            chars[i] +=32;
        }
        String newStr=String.valueOf(chars);
        return newStr;
    }

}
