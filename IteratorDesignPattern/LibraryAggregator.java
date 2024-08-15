package BehaviouralDesignPatterns.IteratorDesignPattern;

import java.util.List;

public class LibraryAggregator implements Aggregator{

    private List<Book> booksList;

    public LibraryAggregator(List<Book> bookList){
        this.booksList = bookList;
    }
    @Override
    public Iterator createIterator() {
        return new BookIterator(booksList);
    }
}
