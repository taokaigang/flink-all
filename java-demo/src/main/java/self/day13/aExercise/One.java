package self.day13.aExercise;


public class One {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Person[] array = new Person[]{
                new Person("xiaobai", 12, 166, 50),
                new Person("xiaohei", 11, 156, 55),
                new Person("xiaohuang", 19, 176, 70),
                new Person("xiaolv", 15, 164, 66),
                new Person("xiaocheng", 13, 136, 60),
                new Person("xiaohong", 17, 168, 45),
                new Person("xiaolan", 22, 169, 54),
                new Person("xiaozi", 10, 126, 59)
        };

        ArrayOperations.sort(array,(p1, p2) -> p1.age-p2.age);
        for (Person person : array) {
            System.out.println(person);
        }
        System.out.println("---------------------------------------------");
        ArrayOperations.sort(array,(p1, p2) -> p1.height-p2.height);
        for (Person person : array) {
            System.out.println(person);
        }
        System.out.println("---------------------------------------------");
        ArrayOperations.sort(array,(p1, p2) -> p1.weight-p2.weight);
        for (Person person : array) {
            System.out.println(person);
        }
        System.out.println("---------------------------------------------");
        Person maxAge = ArrayOperations.getMax(array, (p1, p2) -> p1.age - p2.age);
        System.out.println(maxAge);
        Person maxWeight = ArrayOperations.getMax(array, (p1, p2) -> p1.weight - p2.weight);
        System.out.println(maxWeight);
        Person maxHeight = ArrayOperations.getMax(array, (p1, p2) -> p1.height - p2.height);
        System.out.println(maxHeight);
        System.out.println("---------------------------------------------");

        Person[] getAge = ArrayOperations.get(array, person -> person.age > 10);
        for (Person person : getAge) {
            System.out.println(person);
        }
        System.out.println("---------------------------------------------");
        Person[] getHeight = ArrayOperations.get(array, person -> person.height > 170);
        for (Person person : getHeight) {
            System.out.println(person);
        }
        System.out.println("---------------------------------------------");

        Person[] removeIf = ArrayOperations.removeIf(array, person -> person.age > 10);
        for (Person person : removeIf) {
            System.out.println(person);
        }

    }

}