import java.time.Year;

public class Book {
    private static final int CURRENT_YEAR = Year.now().getValue();
    private String title;
    private String author;
    private int year;

    public Book(String title, int year, String author) {
        if (title == null || title.isBlank() || year > CURRENT_YEAR ||
                year <= 1200 || author == null || author.isBlank()) {
            throw new IllegalArgumentException("Ошибка данных");
        }
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if ((title != null) && !title.isBlank()) {
            this.title = title;
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if ((author != null) && !author.isBlank()) {
            this.author = author;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <= CURRENT_YEAR) {
            this.year = year;
        }
    }

    public String getBookInfo() {
        return String.format("Название: %s, Автор: %s, Год: %d.", title, author, year);
    }
}