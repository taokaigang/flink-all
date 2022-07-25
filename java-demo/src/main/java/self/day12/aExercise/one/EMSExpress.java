package self.day12.aExercise.one;

public class EMSExpress implements AirTransportation {
    @Override
    public void airTransportation(String goods) {
        System.out.println(goods+"可以用EMS空运");
    }
}
