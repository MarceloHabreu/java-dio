package list.Research.Test;

import list.Research.Domain.Book;

import java.util.ArrayList;
import java.util.List;

public class BookCatalogue {
    // Attributes
    private List<Book> bookList;

    // Contructor
    public BookCatalogue() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(String title, String author, int yearPublication){
        bookList.add(new Book(title, author, yearPublication));
    }

    public List<Book> searchByAuthor(String author) {
        List<Book>  booksByAuthor = new ArrayList<>();
        if(!bookList.isEmpty()){
            for(Book b : bookList){
                if(b.getAuthor().equalsIgnoreCase(author)) {
                    booksByAuthor.add(b);
                }
            }
        }
        return booksByAuthor;
    }

    public List<Book> searchByYearsRanges(int initialYear, int lastYear){
        List<Book>  booksByYearsRanges = new ArrayList<>();
        if(!bookList.isEmpty()){
            for(Book b : bookList) {
                if(b.getYearPublication() >= initialYear && b.getYearPublication() <= lastYear){
                    booksByYearsRanges.add(b);
                }
            }
        }
        return booksByYearsRanges;
    }

    public Book searchByTitle(String title){
        Book bookByTitle = null;
        if(!bookList.isEmpty()){
            for(Book b : bookList){
                if(b.getTitle().equalsIgnoreCase(title)){
                    bookByTitle = b;
                    break;
                }
            }
        }
        return bookByTitle;
    }


    public static void main(String[] args) {
        BookCatalogue bookCatalogue = new BookCatalogue();
        bookCatalogue.addBook("Book 1", "Author 1", 2023);
        bookCatalogue.addBook("Book 2", "Author 2", 1990);
        bookCatalogue.addBook("Book 3", "Author 2", 1995);
        bookCatalogue.addBook("Book 4", "Author 4", 2007);
        bookCatalogue.addBook("Book 4", "Author 5", 2024);

        System.out.println("--------Search by Author: --------");
        System.out.println(bookCatalogue.searchByAuthor("Author 2"));
        System.out.println("--------Search by years ranges: --------");
        System.out.println(bookCatalogue.searchByYearsRanges(2020,2024));
        System.out.println("--------Search by title 'bringing only the first one!': --------");
        System.out.println(bookCatalogue.searchByTitle("Book 4"));

    }
}
