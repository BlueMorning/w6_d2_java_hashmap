import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;


    public Library(int _capacity){
        books    = new ArrayList<>();
        capacity = _capacity;
    }


    public int getBooksCount() {
        return books.size();
    }


    public void addBook(Book newBook) {
        if(this.getBooksCount() < this.capacity) {
            this.books.add(newBook);
        }
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void lend(Book shining, Borrower borrower) {
        shining.setAsLent();
        borrower.borrowBook(shining);
    }

}
