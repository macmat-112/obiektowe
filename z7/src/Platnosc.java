import java.util.Objects;

public class Platnosc
{
	private double kwota;
	private String statusPlatnosci;

	public double getKwota() {
		return kwota;
	}

	public void setKwota(double kwota) {
		this.kwota = kwota;
	}

	public String getStatusPlatnosci() {
		return statusPlatnosci;
	}

	public void setStatusPlatnosci(String statusPlatnosci) {
		this.statusPlatnosci = statusPlatnosci;
	}

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

	@Override
	public int hashCode()
	{
		return Objects.hash(this.kwota, this.statusPlatnosci);
	}
}
