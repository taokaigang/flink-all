package self.day12.aExercise.one;

public class SFExpress implements AirTransportation,LandTransportation {
    @Override
    public void airTransportation(String goods) {
        System.out.println(goods+"可以用SF空运");
    }

    @Override
    public void landTransportation(String goods) {
        System.out.println(goods+"可以用SF陆运");
    }
}
