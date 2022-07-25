package self.day16.aExercise;

public class Three {
    /**
     * 3. 已知一个合法的QQ号码，应该遵循规则如下:
     *     1. 长度范围在[6,11]
     *     2. 纯数字组成
     *     3. 不能以0开头
     * @param args
     */
    public static void main(String[] args) {
        isLawful("01336361047");
    }
    private static void isLawful(String QQ){
        int length=QQ.length();
        if (length < 6 && length > 11){
            throw new NotLawfulException("长度超出[6,11]");
        }else if (!isNumber(QQ)){
            throw new NotLawfulException("输入的QQ不是纯数字！");
        }else if (firstIsZero(QQ)){
            throw new NotLawfulException("不能以0开头");
        }else {
            System.out.println("申请成功！");
        }
    }
    private static boolean isNumber(String string){
        for (int i = 0; i < string.length(); i++) {
            int ch=string.charAt(i);
            if (ch<48||ch>57){
                return false;
            }
        }
        return true;
    }
    private static boolean firstIsZero(String string){
        int ch=string.charAt(0);
        if(48==ch){
            return true;
        }
        return false;
    }
}
