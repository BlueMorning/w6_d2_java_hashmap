import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;


    public Library(int _capacity){
        books    = new ArrayList<>();
        capacity = _capacity;
    }


    public Object getBooksCount() {
        return books.size();
    }


    public void addBook(Book newBook) {
        this.books.add(newBook);
    }

    public int getCapacity() {
        return this.capacity;
    }
}
