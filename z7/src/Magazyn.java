import java.util.HashMap;
import java.util.ArrayList;

public class Magazyn
{
	private HashMap<Produkt, Integer> produkty;
	
	public Magazyn(ArrayList<Produkt> l)
	{
		this.produkty = new HashMap<>();
		for(Produkt p : l) this.produkty.put(p, p.iloscNaMagazynie);
	}

	public HashMap<Produkt, Integer> getProdukty() {
		return produkty;
	}

	public void setProdukty(HashMap<Produkt, Integer> produkty) {
		this.produkty = produkty;
	}

	public void asortyment()
	{
		for(Produkt p : this.produkty.keySet()) System.out.println("Nazwa: " + p.nazwa + ", ilość: " + this.produkty.get(p));
	}
}
