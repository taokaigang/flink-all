package self.day23.aExercise.two;

public class Person {
    private String name;
    private int age;
    private Gender gender;
    private int height;
    private int weight;

    public Person(String string) {
        String[] split = string.split(",");
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}

enum Gender{
    Male,Female
}
