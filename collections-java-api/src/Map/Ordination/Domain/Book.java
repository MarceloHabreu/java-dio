package Map.Ordination.Domain;

import java.util.Comparator;
import java.util.Map;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public static class ComparatorByAuthor implements Comparator<Map.Entry<String, Book>> {
        @Override
        public int compare(Map.Entry<String, Book> l1, Map.Entry<String, Book> l2) {
            return l1.getValue().getAuthor().compareToIgnoreCase(l2.getValue().getAuthor());
        }
    }

    public static class ComparatorByPrice implements Comparator<Map.Entry<String, Book>> {
        @Override
        public int compare(Map.Entry<String, Book> l1, Map.Entry<String, Book> l2) {
            return Double.compare(l1.getValue().getPrice(), l2.getValue().getPrice());
        }
    }
}

