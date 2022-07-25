package self.day33.aExercise.one;

public class ShoesFactory {

    public static Shoes getShoes(String shoes,String color){
        if (shoes.equalsIgnoreCase("Nike")){
            return new Nike(color);
        }
        else if (shoes.equalsIgnoreCase("Adidas")){
            return new Adidas(color);
        }

        return null;
    }
}
