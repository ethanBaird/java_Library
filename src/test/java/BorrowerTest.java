import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book;

    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library(10);
        book = new Book("Northern Lights", "Phillip Pullman", "Fantasy");

        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
    }

    @Test
    public void canAddBookToCollection(){
        borrower.addBookToCollection(book);
        assertEquals(1, borrower.getCollectionCount());
    }

    @Test
    public void canBorrowBookFromLibrary(){
        borrower.borrowBook(library, book);
        assertEquals(1, borrower.getCollectionCount());
        assertEquals(2, library.getBookCount());
    }

    @Test
    public void borrowedBookIsCorrect(){
        borrower.borrowBook(library, book);
        boolean expected = borrower.hasBook(book);
        assertTrue(expected);
    }

}
