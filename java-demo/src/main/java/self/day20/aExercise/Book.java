package self.day20.aExercise;

public class Book {
    private String bookName;
    private Author author;
    private Double sellingPrice;

    public Book() {
    }

    public Book(String bookName, Author author, Double sellingPrice) {
        this.bookName = bookName;
        this.author = author;
        this.sellingPrice = sellingPrice;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author=" + author +
                ", sellingPrice=" + sellingPrice +
                '}';
    }
}
