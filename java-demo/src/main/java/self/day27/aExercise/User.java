package self.day27.aExercise;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class User implements Serializable {
    //username=root , password= 1234, id=1, level= 10
    private String username;
    private int password;
    private int id;
    private int level;

    public User(String info) {
        //1.切割
//        String[] parts=info.split(",");
//        Map<String,String> properties=new HashMap<>();
//        for (String part : parts) {
//            String[] tmp=part.split("=");
//            properties.put(tmp[0].trim(),tmp[1].trim());
//        }
//
//        this.username = properties.containsKey("username") ? properties.get("username") : properties.get("yonghu");
//        this.password = Integer.parseInt(properties.containsKey("password") ? properties.get("password") : properties.get("mima"));
//        this.id = Integer.parseInt(properties.get("id"));
//        this.level = Integer.parseInt(properties.containsKey("level") ? properties.get("level") : properties.get("dengji"));
        String[] parts=info.split(",");
        for (String part : parts) {
            String[] kv=part.split("=");
            String key=kv[0].trim();
            String value=kv[1].trim();
            if (key.matches("username|yonghu")){
                this.username=value;
            }else if (key.matches("password|mima")){
                this.password=Integer.parseInt(value);
            }else if (key.matches("id")){
                this.id=Integer.parseInt(value);;
            }else if (key.matches("level|dengji")){
                this.level=Integer.parseInt(value);
            }
        }

    }

    public String getUsername() {
        return username;
    }

    public int getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password=" + password +
                ", id=" + id +
                ", level=" + level +
                '}';
    }
}
