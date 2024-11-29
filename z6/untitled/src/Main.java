import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Produkt p1 = new Produkt("Jabłko", 1, 100);
        Produkt p2 = new Produkt("Gruszka", 1.5, 60);
        Produkt p3 = new Produkt("Pomarańcza", 2, 30);
        KoszykZakupowy koszyk = new KoszykZakupowy();
        koszyk.DodajProdukt(p1, 10);
        koszyk.DodajProdukt(p2, 20);
        koszyk.DodajProdukt(p3, 31);
        koszyk.DodajProdukt(p3, 1);
        Zamowienie zam = new Zamowienie(koszyk, "a");
        zam.ustawStatusZamowienia("Oczekiwanie...");
        Klient klient = new Klient("Maciej", "Matyjasek");
        klient.dodajZamowienie(zam);
        klient.dodajZamowienie(zam);
        Sklep sklep = new Sklep();
        sklep.dodajProdukt(p1);
        sklep.dodajProdukt(p2);
        sklep.dodajProdukt(p3);
        p3.dodajDoMagazynu(50);
        sklep.dodajProdukt(p3);
        sklep.wyswietlOferty();
        Produkt a = sklep.wyszukajProdukt("Jabłko");
        if(a != null) a.wyswietlInformacje();
        else System.out.println("Brak informacji!");
        Produkt b = sklep.wyszukajProdukt("japko");
        if(b != null) b.wyswietlInformacje();
        else System.out.println("Brak informacji!");
        sklep.zakupy(p1, 20, koszyk);
        koszyk.WyswietlZawartoscKoszyka();
    }
}