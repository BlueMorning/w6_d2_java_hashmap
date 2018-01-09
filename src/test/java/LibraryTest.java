import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Timer;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library lib;
    ArrayList<Book> books;


    @Before
    public void before(){
        lib     = new Library(1000);
        books   = new ArrayList<>();
    }


    @Test
    public void hasBooksCollection(){
        assertEquals(0, lib.getBooksCount());
    }

    @Test
    public void canAddBook(){
        lib.addBook(new Book("Jason Bourne"));
        assertEquals(1, lib.getBooksCount());
    }

    @Test
    public void hasCapacity(){
        assertEquals(1000, lib.getCapacity());
    }

    @Test
    public void canAddBookBeyondCapacity(){

        for(int i = 0; i < 2000; i++){
            lib.addBook(new Book(String.format("%s", System.currentTimeMillis())));
        }

        assertEquals(lib.getCapacity(), lib.getBooksCount());
    }






}
