package self.day33.aExercise.one;

public class One {
    /**
     * 1. 用简单工厂实现:小明需要一个红色的耐克球鞋，小白需要一个白色的阿迪达斯球鞋。
     * @param args
     */
    public static void main(String[] args) {
        Shoes nike = ShoesFactory.getShoes("Nike", "红色");
        Shoes adidas = ShoesFactory.getShoes("Adidas", "白色");
    }
}
