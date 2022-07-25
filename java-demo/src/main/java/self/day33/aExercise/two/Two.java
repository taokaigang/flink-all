package self.day33.aExercise.two;

public class Two {
    /**
     * 2. 用工厂方法实现:小明需要一个红色的耐克球鞋，小白需要一个白色的阿迪达斯球鞋。
     * @param args
     */
    public static void main(String[] args) {
        Nike red = new NikeFactory().getShoes("红色");
        Adidas white = new AdidasFactory().getShoes("白色");
    }
}
