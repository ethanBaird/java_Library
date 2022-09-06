import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library (){
        this.books = new ArrayList<>();
    }

    public int getBookCount(){
        return this.books.size();
    }

    public void addBook(Book book){
        this.books.add(book);
    }

}
