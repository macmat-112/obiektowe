import java.util.HashMap;

public class KoszykZakupowy
{
    private HashMap<Produkt, Integer> lista;

    public KoszykZakupowy()
    {
        this.lista = new HashMap<>();
    }

    public HashMap<Produkt, Integer> getLista() {
        return lista;
    }

    public void setLista(HashMap<Produkt, Integer> lista) {
        this.lista = lista;
    }

    public void DodajProdukt(Produkt p, int i)
    {
        if(p.iloscNaMagazynie >= i)
        {
            if(!lista.containsKey(p)) lista.put(p, i);
            else lista.put(p, lista.get(p) + i);
            p.iloscNaMagazynie -= i;
            System.out.println("Dodano " + i + " " + p.nazwa + ".");
        }
        else if(p.iloscNaMagazynie > 0)
        {
            if(!lista.containsKey(p)) lista.put(p, p.iloscNaMagazynie);
            else lista.put(p, lista.get(p) + p.iloscNaMagazynie);
            System.out.println("Dodano pozostałe " + p.iloscNaMagazynie + " " + p.nazwa + ".");
            p.iloscNaMagazynie = 0;
        }
        else System.out.println("Brak towaru " + p.nazwa + ".");
    }

    public void WyswietlZawartoscKoszyka()
    {
        for(Produkt p : lista.keySet()) System.out.println("Nazwa: " + p.nazwa + ", " + "Ilość: " + lista.get(p));
    }

    public void ObliczCalkowitaWartosc()
    {
        double wartosc = 0;
        for(Produkt p : lista.keySet()) wartosc += p.cena * lista.get(p);
        System.out.println("Wartość: " + wartosc + ".");
    }

    public double ZwrocCalkowitaWartosc()
    {
        double wartosc = 0;
        for(Produkt p : lista.keySet()) wartosc += p.cena * lista.get(p);
        return wartosc;
    }
}
