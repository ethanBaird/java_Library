import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("Northern Lights", "Phillip Pullman", "Fantasy");
    }

    @Test
    public void bookHasAttributes(){
        assertEquals("Northern Lights", book.getTitle());
        assertEquals("Phillip Pullman", book.getAuthor());
        assertEquals("Fantasy", book.getGenre());
    }

}
