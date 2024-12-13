public class Zamowienie implements ZamowienieInterfejs {
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
    	if(platnosc.getKwota() == 0)
    	{
    		this.statusZamowienia = "Gotowe do wysyłki.";
    		System.out.println("Zamówienie sfinalizowane.");
    	}
    	else System.out.println("Płatność nie została zrealizowana!");
    }
    
    public void zwrocProdukt(Produkt p)
    {
    	if(this.koszyk.getLista().containsKey(p))
    	{
    		p.setIloscNaMagazynie(p.getIloscNaMagazynie() + this.koszyk.getLista().get(p));
    		this.platnosc.setKwota(this.platnosc.getKwota() + (p.getCena() * this.koszyk.getLista().get(p)));
    		this.koszyk.getLista().remove(p);
    		System.out.println("Produkt " + p.getNazwa() + " został zwrócony.");
    	}
    	else System.out.println("Produkt " + p.getNazwa() + " nie znajduje się w koszyku!");
    }
}
