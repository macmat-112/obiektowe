import java.util.HashMap;

public class KoszykZakupowy extends Osoba implements KoszykZakupowyInterfejs {
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
        if(p.getIloscNaMagazynie() >= i)
        {
            if(!lista.containsKey(p)) lista.put(p, i);
            else lista.put(p, lista.get(p) + i);
            p.setIloscNaMagazynie(p.getIloscNaMagazynie() - i);
            System.out.println("Dodano " + i + " " + p.getNazwa() + ".");
        }
        else if(p.getIloscNaMagazynie() > 0)
        {
            if(!lista.containsKey(p)) lista.put(p, p.getIloscNaMagazynie());
            else lista.put(p, lista.get(p) + p.getIloscNaMagazynie());
            System.out.println("Dodano pozostałe " + p.getIloscNaMagazynie() + " " + p.getNazwa() + ".");
            p.setIloscNaMagazynie(0);
        }
        else System.out.println("Brak towaru " + p.getNazwa() + ".");
    }

    public void WyswietlZawartoscKoszyka()
    {
        for(Produkt p : lista.keySet()) System.out.println("Nazwa: " + p.getNazwa() + ", " + "Ilość: " + lista.get(p));
    }

    public void ObliczCalkowitaWartosc()
    {
        double wartosc = 0;
        for(Produkt p : lista.keySet()) wartosc += p.getCena() * lista.get(p);
        System.out.println("Wartość: " + wartosc + ".");
    }

    public double ZwrocCalkowitaWartosc()
    {
        double wartosc = 0;
        for(Produkt p : lista.keySet()) wartosc += p.getCena() * lista.get(p);
        return wartosc;
    }
}
