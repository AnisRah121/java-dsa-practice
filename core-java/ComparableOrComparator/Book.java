package ComparableOrComparator;

import java.util.*;

public class Book implements Comparable<Book> {

    int id;
    String title;
    double price;

    public Book(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    // Natural ordering based on price
    @Override
    public int compareTo(Book b) {
        return Double.compare(this.price, b.price);
    }

    @Override
    public String toString() {
        return "Book{id=" + id + ", title='" + title + '\'' +
                ", price=" + price + '}';
    }
}

// ---------------- Demo Class ----------------

class Demo1 {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        books.add(new Book(101, "Java Basics", 450.50));
        books.add(new Book(102, "Spring Boot", 650.00));
        books.add(new Book(103, "DSA in Java", 399.99));
        books.add(new Book(104, "Microservices", 750.00));

        // Sorting using Comparable (natural order by price)
        Collections.sort(books);

        // Printing books (toString() called automatically)
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
