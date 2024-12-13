import java.util.Objects;

public class Produkt implements ProduktInterfejs {
    private String nazwa;
    private double cena;
    private int iloscNaMagazynie;

    public Produkt(String name, double price, int amount)
    {
        this.nazwa = name;
        this.cena = price;
        this.iloscNaMagazynie = amount;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getIloscNaMagazynie() {
        return iloscNaMagazynie;
    }

    public void setIloscNaMagazynie(int iloscNaMagazynie) {
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    public void wyswietlInformacje()
    {
        System.out.println("Nazwa: " + this.nazwa);
        System.out.println("Cena: " + this.cena);
        System.out.println("Ilość: " + this.iloscNaMagazynie);
    }

    public void dodajDoMagazynu(int i)
    {
        this.iloscNaMagazynie += i;
    }

    public void usunZMagazynu(int i)
    {
        if(this.iloscNaMagazynie >= i)
        {
            this.iloscNaMagazynie -= i;
            System.out.println("Obecna ilość " + this.nazwa + " w magazynie: " + this.iloscNaMagazynie + ".");
        }
        else if(this.iloscNaMagazynie > 0)
        {
            System.out.println("Usunięto pozostałe " + this.iloscNaMagazynie + " " + this.nazwa + ".");
            this.iloscNaMagazynie = 0;
        }
        else System.out.println("W magazynie nie ma już ani jednego " + this.nazwa + "!");
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(this.nazwa, this.cena);
    }
}
