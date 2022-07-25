package self.day33.aExercise.three;

public abstract class ShoesFactory {
    public Nike getNike(String color){
        return null;
    }
    public Adidas getAdidas(String color){
        return null;
    }
}

class NikeFactory extends ShoesFactory{
    @Override
    public Nike getNike(String color) {
        return super.getNike(color);
    }
}
class AdidasFactory extends ShoesFactory{
    @Override
    public Adidas getAdidas(String color) {
        return super.getAdidas(color);
    }
}
