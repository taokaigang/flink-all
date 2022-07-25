package self.day33.aExercise.two;

public abstract class ShoesFactory {
    public abstract Shoes getShoes(String color);
}

class NikeFactory extends ShoesFactory{
    @Override
    public Nike getShoes(String color) {
        return new Nike(color);
    }
}

class AdidasFactory extends ShoesFactory{
    @Override
    public Adidas getShoes(String color) {
        return new Adidas(color);
    }
}
