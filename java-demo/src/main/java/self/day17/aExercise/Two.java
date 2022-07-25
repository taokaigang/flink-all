package self.day17.aExercise;

public class Two {
    /**
     * 2. 【简】已知方法 trim(String str, char c) 的作用是，去除字符串首尾指定的字符，实现
     * 这个方法。
     * @param args
     */
    public static void main(String[] args) {

        String trim = trim("aaaahello a worldaaaa", 'a');// -> hello a world
        System.out.println(trim);
    }
    private static String trim(String str,char c){
        int begin = 0;
        int end = str.length();
        char[] chars = str.toCharArray();

        while ((begin < end) && (chars[begin] <= c)) {
            begin++;
        }
        while ((begin < end) && (chars[end - 1] <= c)) {
            end--;
        }
        return ((begin > 0) || (end < str.length())) ? str.substring(begin, end) : str;
    }
}
