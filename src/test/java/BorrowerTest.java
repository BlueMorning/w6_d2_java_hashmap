import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book shining;

    @Before
    public void before(){
        borrower = new Borrower();
        shining = new Book("Shining", "thriller");
    }

    @Test
    public void hasBorrowed(){
        assertEquals(0, borrower.getBooksCount());
    }


    @Test
    public void canBorrowBook(){
        borrower.borrowBook(shining);
        assertEquals(1, borrower.getBooksCount());
    }

}
