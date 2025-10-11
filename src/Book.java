public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, int year, String author) {
        ValidationUtils.requireNonBlank("Название", title);
        ValidationUtils.requireNonBlank("Автор", author);
        ValidationUtils.requireNotFutureYear(year);
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        ValidationUtils.requireNonBlank("Название", title);
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        ValidationUtils.requireNonBlank("Автор", author);
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        ValidationUtils.requireNotFutureYear(year);
        this.year = year;
    }

    public String getBookInfo() {
        return String.format("Название: %s, Автор: %s, Год: %d.", title, author, year);
    }
}