import java.util.ArrayList;
import java.util.Objects;

public class FantasyBookList extends BookList
{
    public String fantasySubgenre;

    public FantasyBookList(String title, String author, ArrayList<Double> reviews, String fantasySubgenre) {
        super(title, author, reviews);
        this.fantasySubgenre = fantasySubgenre;
    }

    public String getFantasySubgenre() {
        return fantasySubgenre;
    }

    public void setFantasySubgenre(String fantasySubgenre) {
        this.fantasySubgenre = fantasySubgenre;
    }

    @Override
    public String toString() {
        return "FantasyBook{" +
                "fantasySubgenre='" + fantasySubgenre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FantasyBookList that = (FantasyBookList) o;
        return Objects.equals(fantasySubgenre, that.fantasySubgenre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fantasySubgenre);
    }
}
