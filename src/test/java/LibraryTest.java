import com.sun.xml.internal.xsom.impl.scd.Iterators;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library lib;
    ArrayList<Book> books;
    Borrower borrower;
    Book shining;

    String[] genres = {"mystery", "novel", "thriller", "history"};

    @Before
    public void before(){
        lib         = new Library(1000);
        books       = new ArrayList<>();
        borrower    = new Borrower();
        shining     = new Book("shining", "mystery");
    }


    @Test
    public void hasBooksCollection(){
        assertEquals(0, lib.getBooksCount());
    }

    @Test
    public void canAddBook(){
        lib.addBook(new Book("Jason Bourne", "thriller"));
        assertEquals(1, lib.getBooksCount());
    }

    @Test
    public void hasCapacity(){
        assertEquals(1000, lib.getCapacity());
    }

    @Test
    public void canAddBookBeyondCapacity(){

        for(int i = 0; i < 2000; i++){
            lib.addBook(new Book(String.format("%s", System.currentTimeMillis()), genres[new Random().nextInt(genres.length)]));
        }

        assertEquals(lib.getCapacity(), lib.getBooksCount());
    }


    @Test
    public void canLendBook(){
        this.lib.lend(shining, borrower);
        assertEquals(false, shining.isAvailable());
        assertEquals(1, borrower.getBooksCount());
    }

    @Test
    public void canGiveBackBook(){
        this.lib.giveBackBook(shining, borrower);
        assertEquals(true, shining.isAvailable());
        assertEquals(0, borrower.getBooksCount());
    }

    @Test
    public void canCountBooksGenres(){

        this.lib.addBook(new Book("a", genres[0]));
        this.lib.addBook(new Book("b", genres[0]));
        this.lib.addBook(new Book("c", genres[1]));
        this.lib.addBook(new Book("d", genres[1]));
        this.lib.addBook(new Book("e", genres[1]));
        this.lib.addBook(new Book("f", genres[2]));
        this.lib.addBook(new Book("g", genres[2]));
        this.lib.addBook(new Book("h", genres[3]));
        this.lib.addBook(new Book("i", genres[3]));
        this.lib.addBook(new Book("j", genres[3]));
        this.lib.addBook(new Book("k", genres[3]));


        HashMap<String, Integer> booksCountByGenre = this.lib.countBooksByGenre();


        assertEquals(2, booksCountByGenre.get(genres[0]).intValue());
        assertEquals(3, booksCountByGenre.get(genres[1]).intValue());
        assertEquals(2, booksCountByGenre.get(genres[2]).intValue());
        assertEquals(4, booksCountByGenre.get(genres[3]).intValue());

    }

}
