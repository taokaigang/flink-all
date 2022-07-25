package self.day20.aExercise;

public class Five {
    /**
     * 5. 【中】程序设计：图书管理器，设计一个图书管理器，实现对图书进行的存储管理操作，实现功能
     *       1. 添加一本图书（书名、作者（姓名，年龄，性别）、售价）
     *       2. 删除一本图书（通过书名删除）
     *       3. 删除所有的指定作者的书（通过作者姓名删除）
     *       4. 将所有的图书按照图书售价降序排序。若售价相同，按照作者年龄升序）
     * @param args
     */
    public static void main(String[] args) {
        Author author1=new Author("天蚕土豆",Gender.Male,31);
        Author author2=new Author("莫言",Gender.Male,65);

        Book book1=new Book("斗破苍穹",author1,50.0);
        Book book2=new Book("红高粱",author2,99.9);
        Book book3=new Book("蛙",author2,66.0);

        LibraryManager libraryManager=new LibraryManager();
        libraryManager.add(book1);
        libraryManager.add(book2);
        libraryManager.add(book3);

        libraryManager.remove("红高粱");

        libraryManager.removeAll("莫言");

        libraryManager.sort();
        System.out.println(libraryManager);

    }
}
