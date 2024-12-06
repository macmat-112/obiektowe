public class Zamowienie
{
    private KoszykZakupowy koszyk;
    private String statusZamowienia;
    private Platnosc platnosc;

    public Zamowienie(KoszykZakupowy k, String s, Platnosc p)
    {
        this.koszyk = k;
        this.statusZamowienia = s;
        this.platnosc = p;
    }

    public KoszykZakupowy getKoszyk() {
        return koszyk;
    }

    public void setKoszyk(KoszykZakupowy koszyk) {
        this.koszyk = koszyk;
    }

    public String getStatusZamowienia() {
        return statusZamowienia;
    }

    public void setStatusZamowienia(String statusZamowienia) {
        this.statusZamowienia = statusZamowienia;
    }

    public Platnosc getPlatnosc() {
        return platnosc;
    }

    public void setPlatnosc(Platnosc platnosc) {
        this.platnosc = platnosc;
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
