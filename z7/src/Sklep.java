import java.util.ArrayList;
import java.util.Objects;
import java.time.LocalDate;

public class Sklep
{
    private String nazwaSklepu;
    private LocalDate dataPowstania;
    private Magazyn magazynSklepu;
    private ArrayList<Produkt> produkty;

    public Sklep(String a, LocalDate b, ArrayList<Produkt> p, Magazyn m)
    {
        if(b.isAfter(LocalDate.now())) System.out.println("Podaj poprawną datę!");
        else
        {
            this.nazwaSklepu = a;
            this.dataPowstania = b;
            this.produkty = p;
            this.magazynSklepu = m;
        }
    }

    public String getNazwaSklepu() {
        return nazwaSklepu;
    }

    public void setNazwaSklepu(String nazwaSklepu) {
        this.nazwaSklepu = nazwaSklepu;
    }

    public LocalDate getDataPowstania() {
        return dataPowstania;
    }

    public void setDataPowstania(LocalDate dataPowstania) {
        this.dataPowstania = dataPowstania;
    }

    public Magazyn getMagazynSklepu() {
        return magazynSklepu;
    }

    public void setMagazynSklepu(Magazyn magazynSklepu) {
        this.magazynSklepu = magazynSklepu;
    }

    public ArrayList<Produkt> getProdukty() {
        return produkty;
    }

    public void setProdukty(ArrayList<Produkt> produkty) {
        this.produkty = produkty;
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
