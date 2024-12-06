package zestaw6;

public class Platnosc
{
	public double kwota;
	public String statusPlatnosci;
	
	public Platnosc(double a, String b)
	{
		this.kwota = a;
		this.statusPlatnosci = b;
	}
	
	public void zaplac()
	{
		this.kwota = 0;
		this.statusPlatnosci = "Opłacone.";
	}
}
