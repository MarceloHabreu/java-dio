package Map.Ordination.Test;

import Map.Ordination.Domain.Book;

import java.util.*;

public class BookstoreOnline {
    private Map<String, Book> books;

    public BookstoreOnline() {
        this.books = new HashMap<>();
    }

    public void addBook(String link, Book book){
        books.put(link, book);
    }

    public void removeBook(String title) {
        List<String> removeKeys = new ArrayList<>();
        for (Map.Entry<String, Book> entry : books.entrySet()){
            if (entry.getValue().getTitle().equalsIgnoreCase(title)){
                removeKeys.add(entry.getKey());
            }
        }
        for (String key : removeKeys) {
            books.remove(key);
        }
    }

    public Map<String, Book> showBooksSortedByPrice(){
        List<Map.Entry<String, Book>> booksForSortedByPrice = new ArrayList<>(books.entrySet());
        Collections.sort(booksForSortedByPrice, new Book.ComparatorByPrice());
        Map<String, Book> booksSortedByPrice = new LinkedHashMap<>();
        for (Map.Entry<String, Book> entry : booksForSortedByPrice) {
            booksSortedByPrice.put(entry.getKey(), entry.getValue());
        }
        return booksSortedByPrice;
    }

    public Map<String, Book> showBooksSortedByAuthor(){
        List<Map.Entry<String, Book>> booksForSortedByAuthor = new ArrayList<>(books.entrySet());
        Collections.sort(booksForSortedByAuthor, new Book.ComparatorByAuthor());
        Map<String, Book> booksSortedByAuthor = new LinkedHashMap<>();
        for (Map.Entry<String, Book> entry : booksForSortedByAuthor) {
            booksSortedByAuthor.put(entry.getKey(), entry.getValue());
        }
        return booksSortedByAuthor;
    }

    public Map<String, Book> searchBooksForAuthor(String author) {
        Map<String, Book> booksForAuthor = new LinkedHashMap<>();
        for (Map.Entry<String, Book> entry : books.entrySet()) {
            Book book = entry.getValue();
            if (book.getAuthor().equals(author)) {
                booksForAuthor.put(entry.getKey(), book);
            }
        }
        return booksForAuthor;
    }

    public List<Book> getBookMoreExpensive() {
        List<Book> booksMoreExpensive = new ArrayList<>();
        double priceMoreHigh = Double.MIN_VALUE;

        if (!books.isEmpty()){
            for (Book book : books.values()){
                if (book.getPrice() > priceMoreHigh) {
                    priceMoreHigh = book.getPrice();
                }
            }
        } else {
            throw new NoSuchElementException("The bookstore is empty!");
        }
        for (Map.Entry<String, Book> entry: books.entrySet()) {
            if (entry.getValue().getPrice() == priceMoreHigh){
                Book bookWithPriceMoreHigh = books.get(entry.getKey());
                booksMoreExpensive.add(bookWithPriceMoreHigh);
            }
        }
        return booksMoreExpensive;
    }

    public List<Book> getBookMoreCheap() {
        List<Book> booksMoreCheap = new ArrayList<>();
        double priceMoreLower = Double.MAX_VALUE;

        if (!books.isEmpty()) {
            for (Book book : books.values()) {
                if (book.getPrice() < priceMoreLower) {
                    priceMoreLower = book.getPrice();
                }
            }
        } else {
            throw new NoSuchElementException("The bookstore is empty!");
        }
        for (Map.Entry<String, Book> entry: books.entrySet()){
            if (entry.getValue().getPrice() == priceMoreLower) {
                Book bookWithPriceMoreLower = books.get(entry.getKey());
                booksMoreCheap.add(bookWithPriceMoreLower);
            }
        }
        return booksMoreCheap;
    }

    public static void main(String[] args) {
        BookstoreOnline onlineBookstore = new BookstoreOnline();
        // Add books to the online bookstore
        onlineBookstore.addBook("https://amzn.to/3EclT8Z", new Book("1984", "George Orwell", 50d));
        onlineBookstore.addBook("https://amzn.to/47Umiun", new Book("Animal Farm", "George Orwell", 7.05d));
        onlineBookstore.addBook("https://amzn.to/3L1FFI6", new Book("Bird Box", "Josh Malerman", 19.99d));
        onlineBookstore.addBook("https://amzn.to/3OYb9jk", new Book("Malorie", "Josh Malerman", 5d));
        onlineBookstore.addBook("https://amzn.to/45HQE1L", new Book("And Then There Were None", "Agatha Christie", 50d));
        onlineBookstore.addBook("https://amzn.to/45u86q4", new Book("Murder on the Orient Express", "Agatha Christie", 5d));

        // Display all books sorted by price
        System.out.println("Books sorted by price: \n" + onlineBookstore.showBooksSortedByPrice());

        // Display all books sorted by author
        System.out.println("Books sorted by author: \n" + onlineBookstore.showBooksSortedByAuthor());

        // Search books by author
        String searchAuthor = "Josh Malerman";
        onlineBookstore.searchBooksForAuthor(searchAuthor);

        // Get and display the most expensive book
        System.out.println("Most expensive book: " + onlineBookstore.getBookMoreExpensive());

        // Get and display the cheapest book
        System.out.println("Cheapest book: " + onlineBookstore.getBookMoreCheap());

        // Remove a book by title
        onlineBookstore.removeBook("1984");
        System.out.println(onlineBookstore.books);
    }

}
