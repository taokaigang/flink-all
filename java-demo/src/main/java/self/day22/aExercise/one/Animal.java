package self.day22.aExercise.one;

import java.util.Objects;

public class Animal {
    private Integer number;
    private String name;
    private Gender gender;
    private Integer age;

    public Animal(Integer number, String name, Gender gender, Integer age) {
        this.number = number;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(number, animal.number) &&
                Objects.equals(name, animal.name) &&
                gender == animal.gender &&
                Objects.equals(age, animal.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name, gender, age);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}

enum Gender{
    Male,Female
}
