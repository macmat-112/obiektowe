public class Adres implements AdresInterfejs {
    private String ulica;
    private int numerDomu;
    private Integer numerMieszkania;
    private String miasto;
    private String kodPocztowy;

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public Integer getNumerMieszkania() {
        return numerMieszkania;
    }

    public void setNumerMieszkania(Integer numerMieszkania) {
        this.numerMieszkania = numerMieszkania;
    }

    public int getNumerDomu() {
        return numerDomu;
    }

    public void setNumerDomu(int numerDomu) {
        this.numerDomu = numerDomu;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public Adres(String a, int b, int c, String d, String e)
    {
        this.ulica = a;
        this.numerDomu = b;
        this.numerMieszkania = c;
        this.miasto = d;
        this.kodPocztowy = e;
    }

    public Adres(String a, int b, String c, String d)
    {
        this.ulica = a;
        this.numerDomu = b;
        this.miasto = c;
        this.kodPocztowy = d;
    }

    public void pokaz()
    {
        System.out.println(this.kodPocztowy + " " + this.miasto);
        if(this.numerMieszkania != null) System.out.println(this.ulica + " " + this.numerDomu + " " + this.numerMieszkania);
        else System.out.println(this.ulica + " " + this.numerDomu);
    }

    public boolean przed(Adres a)
    {
        char[] ar1 = this.kodPocztowy.toCharArray();
        char[] ar2 = a.kodPocztowy.toCharArray();
        for(int i = 0; i < ar1.length; i++)
        {
            if(ar1[i] < ar2[i]) return true;
            else if(ar1[i] > ar2[i]) return false;
        }
        return false;
    }


}
