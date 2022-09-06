import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<>();
    }

    public int getCollectionCount(){
        return this.collection.size();
    }

    public void addBookToCollection(Book book){
        this.collection.add(book);
    }

    public void borrowBook(Library library, Book book){
        Book bookToBorrow = library.lend(book);
        this.addBookToCollection(bookToBorrow);
    }

    public boolean hasBook(Book book){
        return this.collection.contains(book);
    }

}
