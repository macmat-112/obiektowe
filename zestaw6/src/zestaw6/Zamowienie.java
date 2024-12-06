package zestaw6;

public class Zamowienie
{
    public KoszykZakupowy koszyk;
    public String statusZamowienia;
    public Platnosc platnosc;

    public Zamowienie(KoszykZakupowy k, String s, Platnosc p)
    {
        this.koszyk = k;
        this.statusZamowienia = s;
        this.platnosc = p;
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
    
    public void finalizujZamowienie()
    {
    	if(platnosc.kwota == 0)
    	{
    		this.statusZamowienia = "Gotowe do wysyłki.";
    		System.out.println("Zamówienie sfinalizowane.");
    	}
    	else System.out.println("Płatność nie została zrealizowana!");
    }
    
    public void zwrocProdukt(Produkt p)
    {
    	if(this.koszyk.lista.containsKey(p))
    	{
    		p.iloscNaMagazynie += this.koszyk.lista.get(p);
    		this.platnosc.kwota -= p.cena * this.koszyk.lista.get(p);
    		this.koszyk.lista.remove(p);
    		System.out.println("Produkt " + p.nazwa + " został zwrócony.");
    	}
    	else System.out.println("Produkt " + p.nazwa + " nie znajduje się w koszyku!");
    }
}
