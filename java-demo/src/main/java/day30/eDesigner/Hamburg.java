package day30.eDesigner;

/**
 * @Description 汉堡类
 */
public class Hamburg {
    private int id;
    private String name;

    public Hamburg(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Hamburg{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
