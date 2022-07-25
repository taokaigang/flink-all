package self.day33.aExercise.three;

public class Three {
    /**
     * 3. 用抽象工厂实现：小明需要一个红色的耐克球鞋，小白需要一个白色的阿迪达斯裤子。
     * @param args
     */
    public static void main(String[] args) {
        Nike red = new NikeFactory().getNike("红色");
        Adidas white = new AdidasFactory().getAdidas("白色");
    }
}
