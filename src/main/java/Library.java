
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;

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
        shining.setAsNotAvailable();
        borrower.borrowBook(shining);
    }

    public void giveBackBook(Book shining, Borrower borrower) {
        shining.setAsAvailable();
        borrower.giveBackBook(shining);
    }

    public HashMap<String, Integer> countBooksByGenre(){

        HashMap<String, Integer> booksCountByGenre = new HashMap<>();

        for (Book book : this.books) {

            Integer genreCount = booksCountByGenre.get(book.getGenre()) == null ? 0 : booksCountByGenre.get(book.getGenre()).intValue() ;
            booksCountByGenre.put(book.getGenre(), ++genreCount);
        }

        return booksCountByGenre;
    }
}
