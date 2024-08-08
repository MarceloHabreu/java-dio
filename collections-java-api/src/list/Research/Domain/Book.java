package list.Research.Domain;

public class Book {
    // Attributes

    private String title;
    private String Author;
    private int yearPublication;

    // Constructor
    public Book(String title, String author, int yearPublication) {
        this.title = title;
        Author = author;
        this.yearPublication = yearPublication;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return Author;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", Author='" + Author + '\'' +
                ", yearPublication=" + yearPublication +
                '}';
    }
}
