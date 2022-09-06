import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> books;

    public Library (int capacity){
        this.capacity = capacity;
        this.books = new ArrayList<>();
    }

    public int getBookCount(){
        return this.books.size();
    }

    public void addBook(Book book){
        if (this.getBookCount() < this.capacity) {
            this.books.add(book);
        }
    }

}
