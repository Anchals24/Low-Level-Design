package BehaviouralDesignPatterns.IteratorDesignPattern;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List <Book> booksList = Arrays.asList(
                new Book(300, "Maths"),
                new Book (1000, "System Designs"),
                new Book(560, "DSA"),
                new Book(345, "UPSC MAINS")
        );

        LibraryAggregator lib = new LibraryAggregator(booksList);
        Iterator iterator = lib.createIterator();

        while (iterator.hasNext()){
            Book book = (Book) iterator.next();
            System.out.println(book.getBookName());
        }
    }
}
