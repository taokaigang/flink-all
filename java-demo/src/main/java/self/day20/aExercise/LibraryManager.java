package self.day20.aExercise;

import java.util.*;

public class LibraryManager {

    private List<Book> books;

    public LibraryManager() {
        this.books=new ArrayList<>();
    }

    public void add(Book book){
        this.books.add(book);
    }

    public void remove(String string){
        this.books.removeIf(ele->ele.getBookName().equals(string));
    }

    public void removeAll(String string){
        for (int i = 0; i < books.size(); i++) {
            this.books.removeIf(ele->ele.getAuthor().getName().equals(string));
        }
    }

    public void sort(){
        this.books.sort((b1, b2) -> {
            if (b1.getSellingPrice() == b2.getSellingPrice()) {
                return b1.getAuthor().getAge() - b2.getAuthor().getAge();
            }
            return (int) (b2.getSellingPrice() - b1.getSellingPrice());
        });

    }


    @Override
    public String toString() {
        return "LibraryManager{" +
                "books=" + books +
                '}';
    }
}
