import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Library {

    private int capacity;
    private ArrayList<Book> books;
    private HashMap<String, Integer> genres;

    public Library (int capacity){
        this.capacity = capacity;
        this.books = new ArrayList<>();
        this.genres = new HashMap<>();
    }

    public int getBookCount(){
        return this.books.size();
    }

    public void addBook(Book book){
        if (this.getBookCount() < this.capacity) {
            this.books.add(book);
            this.trackGenre(book);
        }
    }

    public void trackGenre(Book book){
        String genre = book.getGenre();
        if (this.genres.containsKey(genre)){
            int current = this.genres.get(genre);
            this.genres.replace(genre, current + 1);
        } else {
            this.genres.put(genre, 1);
        }
    }

    public Book lend(Book book){
        if (this.books.contains(book)){
            int index = this.books.indexOf(book);
            return this.books.remove(index);
        }
        return null;
    }

    public int getBookCountByGenre(String key){
        return genres.get(key);
    }

}
