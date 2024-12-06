package zestaw6;
import java.util.ArrayList;
import java.util.Objects;

public class Sklep
{
    public ArrayList<Produkt> produkty;

    public Sklep()
    {
        this.produkty = new ArrayList<>();
    }

    public void dodajProdukt(Produkt p)
    {
        if(!this.produkty.contains(p))
        {
            this.produkty.add(p);
            System.out.println("Dodano produkt " + p.nazwa + " do sklepu.");
        }
        else System.out.println("Produkt " + p.nazwa + " już znajduje się w sklepie.");
    }

    public void wyswietlOferty()
    {
        System.out.println("Lista produktów: ");
        for(Produkt p : this.produkty) p.wyswietlInformacje();
    }

    public Produkt wyszukajProdukt(String s)
    {
        for(Produkt p : this.produkty)
        {
            if(Objects.equals(p.nazwa, s)) return p;
        }
        return null;
    }

    public void zakupy(Produkt p, int i, KoszykZakupowy k)
    {
        if(this.produkty.contains(p)) k.DodajProdukt(p, i);
        else System.out.println("Brak produktu " + p + "!");
    }
}
