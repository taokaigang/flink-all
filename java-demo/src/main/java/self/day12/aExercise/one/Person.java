package self.day12.aExercise.one;

public class Person {
    String name;
    public Person(String name) {
        this.name = name;
    }

    void AirDelivery(AirTransportation at,String goods){
        at.airTransportation(goods);
    }

    void LandDelivery(LandTransportation lt,String goods){
        lt.landTransportation(goods);
    }

}
