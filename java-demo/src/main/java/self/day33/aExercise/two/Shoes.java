package self.day33.aExercise.two;

public class Shoes {
    private String color;
    public Shoes(String color) {
        this.color = color;
    }
}

class Nike extends Shoes {
    public Nike(String color) {
        super(color);
    }
}

class Adidas extends Shoes {
    public Adidas(String color) {
        super(color);
    }
}
