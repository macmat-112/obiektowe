public class Zamowienie
{
    public KoszykZakupowy koszyk;
    public String statusZamowienia;

    public Zamowienie(KoszykZakupowy k, String s)
    {
        this.koszyk = k;
        this.statusZamowienia = s;
    }

    public void ustawStatusZamowienia(String s)
    {
        this.statusZamowienia = s;
    }

    public void wyswietlZamowienie()
    {
        this.koszyk.WyswietlZawartoscKoszyka();
        System.out.println("Status zamówienia: " + this.statusZamowienia);
    }
}
