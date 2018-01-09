import com.sun.xml.internal.xsom.impl.scd.Iterators;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
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



}
