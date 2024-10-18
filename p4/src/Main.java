import java.util.*;
public class Main
{
    public static int[] generujTablice(int n, int min, int max)
    {
        int[] tab = new int[n];
        Random a = new Random();
        for(int i = 0; i < n; i++) tab[i] = a.nextInt(max - min + 1) + min;
        return tab;
    }
    public static void wypiszTablice(int[] tab, int n, int m)
    {
        int k = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(j + k < tab.length) System.out.print(tab[j + k] + " ");
                else System.out.print("- ");
            }
            System.out.print("\n");
            k += m;
        }
    }
    public static void ileNieparzystych(int[] tab)
    {
        int len = tab.length;
        int suma = 0;
        for(int i = 0; i < len; i++) if(tab[i] % 2 == 1) suma += 1;
        System.out.println(suma + " nieparzystych");
    }
    public static void ileParzystych(int[] tab)
    {
        int len = tab.length;
        int suma = 0;
        for(int i = 0; i < len; i++) if(tab[i] % 2 == 0) suma += 1;
        System.out.println(suma + " parzystych");
    }
    public static void ileDodatnich(int[] tab)
    {
        int len = tab.length;
        int suma = 0;
        for(int i = 0; i < len; i++) if(tab[i] > 0) suma += 1;
        System.out.println(suma + " dodatnich");
    }
    public static void ileUjemnych(int[] tab)
    {
        int len = tab.length;
        int suma = 0;
        for(int i = 0; i < len; i++) if(tab[i] < 0) suma += 1;
        System.out.println(suma + " ujemnych");
    }
    public static void ileZerowych(int[] tab)
    {
        int len = tab.length;
        int suma = 0;
        for(int i = 0; i < len; i++) if(tab[i] == 0) suma += 1;
        System.out.println(suma + " zerowych");
    }
    public static void ileMaksymalnych(int[] tab)
    {
        int len = tab.length;
        int max = tab[0];
        int suma = 1;
        for(int i = 1; i < len; i++)
        {
            if(tab[i] > max)
            {
                max = tab[i];
                suma = 1;
            }
            else if(tab[i] == max) suma += 1;
        }
        System.out.println(suma + " maksymalnych");
    }
    public static void ileMinimalnych(int[] tab)
    {
        int len = tab.length;
        int min = tab[0];
        int suma = 1;
        for(int i = 1; i < len; i++)
        {
            if(tab[i] < min)
            {
                min = tab[i];
                suma = 1;
            }
            else if(tab[i] == min) suma += 1;
        }
        System.out.println(suma + " minimalnych");
    }
    public static void ileUnikalnych(int[] tab)
    {
        int len = tab.length;
        int suma = 0;
        boolean powt;
        for(int i = 0; i < len; i++)
        {
            powt = false;
            for(int j = 0; j < len; j++) if(tab[i] == tab[j] && i != j)
            {
                powt = true;
                break;
            }
            if(!powt) suma += 1;
        }
        System.out.println(suma + " unikalnych");
    }
    public static void sumaDodatnich(int[] tab)
    {
        int len = tab.length;
        int suma = 0;
        for(int i = 0; i < len; i++) if(tab[i] > 0) suma += tab[i];
        System.out.println("Suma dodatnich: " + suma);
    }
    public static void sumaUjemnych(int[] tab)
    {
        int len = tab.length;
        int suma = 0;
        for(int i = 0; i < len; i++) if(tab[i] < 0) suma += tab[i];
        System.out.println("Suma ujemnych: " + suma);
    }
    public static void sumaOdwrotnosci(int[] tab)
    {
        int len = tab.length;
        float suma = 0;
        for(int i = 0; i < len; i++) if(tab[i] != 0) suma += 1 / (float)tab[i];
        System.out.println("Suma odwrotnosci: " + suma);
    }
    public static void sredniaArytmetyczna(int[] tab)
    {
        int len = tab.length;
        int suma = 0;
        for(int i = 0; i < len; i++) suma += tab[i];
        System.out.println("Srednia arytmetyczna: " + (float)suma / len);
    }
    public static void sredniaGeometryczna(int[] tab)
    {
        int len = tab.length;
        int iloczyn = 1;
        for(int i = 0; i < len; i++) iloczyn *= tab[i];
        System.out.println("Srednia geometryczna: " + Math.pow(iloczyn, (float)1 / len));
    }
    public static void sredniaHarmoniczna(int[] tab)
    {
        int len = tab.length;
        float dzielnik = 0;
        for(int i = 0; i < len; i++) dzielnik += 1 / (float)tab[i];
        System.out.println("Srednia harmoniczna: " + (float)len / dzielnik);
    }
    public static void main(String[] args)
    {
        System.out.println("Podaj liczby: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = sc.nextInt();
        int max = sc.nextInt();
        int[] tab = generujTablice(n, min, max);
        wypiszTablice(tab, 5, 6);

    }
}