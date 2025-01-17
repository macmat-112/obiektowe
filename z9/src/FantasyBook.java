import java.util.Objects;

public class FantasyBook extends Book
{
    public String fantasySubgenre;

    public FantasyBook(String title, String author, double[] reviews, String fantasySubgenre) {
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
        FantasyBook that = (FantasyBook) o;
        return Objects.equals(fantasySubgenre, that.fantasySubgenre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fantasySubgenre);
    }
}
