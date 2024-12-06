package zestaw6;
import java.util.ArrayList;

public class Klient
{
    public String imie;
    public String nazwisko;
    public ArrayList<Zamowienie> listaZamowien;

    public Klient(String i, String n)
    {
        this.imie = i;
        this.nazwisko = n;
        this.listaZamowien = new ArrayList<>();
    }

    public void dodajZamowienie(Zamowienie z)
    {
        this.listaZamowien.add(z);
        System.out.println("Dodano zamówienie.");
    }

    public void wyswietlHistorieZamowien()
    {
        int i = 1;
        for(Zamowienie z : this.listaZamowien)
        {
            System.out.println("Zamówienie " + i + ": ");
            z.wyswietlZamowienie();
            i += 1;
        }
    }

    public void obliczLacznyKosztZamowien()
    {
        double koszt = 0;
        for(Zamowienie z : this.listaZamowien) koszt += z.koszyk.ZwrocCalkowitaWartosc();
        System.out.println("Całkowita wartość: " + koszt + ".");
    }
}
