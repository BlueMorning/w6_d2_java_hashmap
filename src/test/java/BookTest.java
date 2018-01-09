import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book myBook;

    @Before
    public void Before(){
        myBook = new Book("Black Box Thinking");
    }


    @Test
    public void hasTitle(){
        assertEquals("Black Box Thinking", myBook.getTitle());
    }



}
