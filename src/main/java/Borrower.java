import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> books;

    public Borrower(){
        books = new ArrayList<>();
    }

    public Object getBooksCount() {
        return books.size();
    }

    public void borrowBook(Book book) {
        this.books.add(book);
    }

    public void giveBackBook(Book book) {
        this.books.remove(book);
    }
}
