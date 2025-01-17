import java.util.Arrays;
import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private double[] reviews;

    public Book(String title, String author, double[] reviews)
    {
        this.title = title;
        this.author = author;
        this.reviews = reviews;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double[] getReviews() {
        return reviews;
    }

    public void setReviews(double[] reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", reviews=" + Arrays.toString(reviews) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.deepEquals(reviews, book.reviews);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, Arrays.hashCode(reviews));
    }
}
