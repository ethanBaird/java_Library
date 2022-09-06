import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Library fullLibrary;
    private Book book;

    @Before
    public void before() {
        library = new Library(10);
        fullLibrary = new Library(0);
        book = new Book("Northern Lights", "Phillip Pullman", "Fantasy");
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBook(book);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void cantAddIfLibraryFull(){
        fullLibrary.addBook(book);
        assertEquals(0, fullLibrary.getBookCount());
    }

    @Test
    public void canGetNumberOfBooksByGenre() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(3, library.getBookCountByGenre("Fantasy"));
    }

}
