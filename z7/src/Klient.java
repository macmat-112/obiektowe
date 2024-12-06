import java.util.ArrayList;
import java.util.Objects;

public class Klient
{
    private String imie;
    private String nazwisko;
    private Adres adres;
    private ArrayList<Zamowienie> listaZamowien;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public ArrayList<Zamowienie> getListaZamowien() {
        return listaZamowien;
    }

    public void setListaZamowien(ArrayList<Zamowienie> listaZamowien) {
        this.listaZamowien = listaZamowien;
    }

    public Klient(String i, String n, Adres a)
    {
        this.imie = i;
        this.nazwisko = n;
        this.adres = a;
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
        for(Zamowienie z : this.listaZamowien) koszt += z.getKoszyk().ZwrocCalkowitaWartosc();
        System.out.println("Całkowita wartość: " + koszt + ".");
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(this.imie, this.nazwisko, this.adres);
    }
}
