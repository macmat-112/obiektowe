import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class BookList {
    private String title;
    private String author;
    private ArrayList<Double> reviews;

    public BookList(String title, String author, ArrayList<Double> reviews)
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

    public ArrayList<Double> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Double> reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "BookList{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", reviews=" + reviews +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookList book = (BookList) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.deepEquals(reviews, book.reviews);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, reviews);
    }
}
