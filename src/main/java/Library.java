import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;



    public Library(){
        books = new ArrayList<>();
    }


    public Object getBooksCount() {
        return books.size();
    }


    public void addBook(Book newBook) {
        this.books.add(newBook);
    }
}
