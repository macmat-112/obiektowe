public class Produkt
{
    public String nazwa;
    public double cena;
    public int iloscNaMagazynie;

    public Produkt(String name, double price, int amount)
    {
        this.nazwa = name;
        this.cena = price;
        this.iloscNaMagazynie = amount;
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
}
