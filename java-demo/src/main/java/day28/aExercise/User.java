package day28.aExercise;

import java.util.Objects;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/28
 * @Description
 */
public class User implements java.io.Serializable {
    private int id;
    private String username;
    private String password;
    private int level;

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
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

    public User(String info) {
        // 1. 以逗号进行切割，获取到键值对部分
        String[] pairs = info.split(",");
        // 2. 遍历存储键值对的数组
        for (String pair : pairs) {
            // 3. 将键值对按照等号进行切割
            String[] kv = pair.split("=");
            // 4. 去除空格
            String key = kv[0].trim();
            String value = kv[1].trim();
            // 5. 给属性赋值
            if (key.matches("username|yonghu")) {
                this.username = value;
            }
            else if (key.matches("password|mima")) {
                this.password = value;
            }
            else if (key.matches("id")) {
                this.id = Integer.parseInt(value);
            }
            else if (key.matches("level|dengji")) {
                this.level = Integer.parseInt(value);
            }
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", level=" + level +
                '}';
    }
}
