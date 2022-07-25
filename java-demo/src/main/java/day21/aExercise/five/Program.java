package day21.aExercise.five;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/20
 * @Description 程序设计：
 * 图书管理器，设计一个图书管理器，实现对图书进行的存储管理操作，实现功能
 *      1. 添加一本图书（书名、作者（姓名，年龄，性别）、售价）
 *      2. 删除一本图书（通过书名删除）
 *      3. 删除所有的指定作者的书（通过作者姓名删除）
 *      4. 将所有的图书按照图书售价降序排序。若售价相同，按照作者年龄升序）
 */
public class Program {
    public static void main(String[] args) {
        // 1. 实例化一个图书管理器
        BookManager manager = new BookManager();
        // 2. 添加图书
        manager.addBook("红楼梦", 100, "曹雪芹", 59, Gender.Male);
        manager.addBook("三国演义", 99, "罗贯中", 64, Gender.Male);
        manager.addBook("西游记", 98, "吴承恩", 55, Gender.Male);
        manager.addBook("水浒传", 101, "施耐庵", 58, Gender.Male);
        // 3. 删除一本图书（通过书名删除）
        manager.removeByName("水浒传");
        // 4.
        manager.removeByAuthor("吴承恩");
    }
}
