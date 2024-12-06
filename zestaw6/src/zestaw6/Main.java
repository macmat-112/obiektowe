package zestaw6;

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
        Platnosc platnosc = new Platnosc(koszyk.ZwrocCalkowitaWartosc(), "Oczekiwanie...");
        Zamowienie zam = new Zamowienie(koszyk, "a", platnosc);
        zam.ustawStatusZamowienia(platnosc.statusPlatnosci);
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
        zam.zwrocProdukt(p3);
        Produkt p4 = new Produkt("coś tam", 1, 1);
        zam.zwrocProdukt(p4);
        zam.finalizujZamowienie();
        platnosc.zaplac();
        zam.finalizujZamowienie();
        Magazyn m = new Magazyn(sklep.produkty);
        m.asortyment();
    }
}
