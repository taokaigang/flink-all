package day21.aExercise.five;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/20
 * @Description 图书管理器，应该具有方法：添加图书、删除图书、对图书排序
 */
public class BookManager {
    // 1. 定义一个集合，存储所有的图书
    private List<Book> bookList;

    public BookManager() {
        this.bookList = new ArrayList<>();
    }

    // 2. 添加一本书
    public void addBook(String bookName, int bookPrice, String authorName, int authorAge, Gender authorGender) {
        this.bookList.add(new Book(bookName, bookPrice, new Author(authorName, authorAge, authorGender)));
    }

    // 3. 按照书名删除
    public void removeByName(String bookName) {
        this.bookList.removeIf(book -> book.getName().equals(bookName));
    }

    // 4. 按照作者名字删除
    public void removeByAuthor(String authorName) {
        this.bookList.removeIf(book -> book.getAuthor().getName().equals(authorName));
    }

    // 5. 对集合中的元素进行排序
    public void sort() {
        this.bookList.sort((book1, book2) -> {
            if (book1.getPrice() != book2.getPrice()) {
                return book2.getPrice() - book1.getPrice();
            }
            return book1.getAuthor().getAge() - book2.getAuthor().getAge();
        });
    }

    // 6. 获取当前集合中的所有的图书
    public List<Book> getBookList() {
        // 切记：如果有这样的需求
        List<Book> result = new ArrayList<>();
        result.addAll(this.bookList);
        return result;
    }
}
