import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> books;


    public Borrower(){
        books = new ArrayList<>();
    }


    public Object getBooksCount() {
        return books.size();
    }
}
