package self.day5;

/**
 * 5. 使⽤递归计算1+2+3+...+100的和
 */
public class ERecursion {
    public static void main(String[] args) {
        int sum = sum(100);
        System.out.println(sum);
    }

    /**
     *
     * @param num
     * @return
     */
    static int sum(int num){
        if (num==1){
            return 1;
        }
        return num+sum(num-1);
    }
}
