package self.day8.A;

public class Person {

    String name;        // 人的名字
    int age;            // 人的年龄
    Dog[] pets;            // 人的宠物

    void showPets(){
        if (pets==null || pets.length==0){
            System.out.println("现在没养狗");
            return;
        }

        for (int i = 0; i < pets.length; i++) {
            System.out.println("宠物姓名："+pets[i].name+"，年龄："+pets[i].age
                    +"，毛色："+pets[i].furColor);

        }
    }
}
