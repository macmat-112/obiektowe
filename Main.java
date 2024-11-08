import java.util.*;

public class Main
{
    public static boolean dokladnosc(double x, double y, int k)
    {
        if(Math.abs(x - y) <= Math.pow(10, -1 * k)) return true;
        else return false;
    }

    public static int najblizszySasiad(int S)
    {
        double a = S;
        double b = (a + (S / a)) / 2;
        while(Math.abs(b - a) >= 1)
        {
            a = b;
            b = (b + (S / b)) / 2;
        }
        return (int)b;
    }

    public static double pierwiastek(int S, int n, int k)
    {
        double a = S;
        double b = ((n - 1) * a + (S / Math.pow(a, (n - 1)))) / n;
        while(Math.abs(b - a) > Math.pow(10, -1 * k))
        {
            a = b;
            b = ((n - 1) * a + (S / Math.pow(a, (n - 1)))) / n;
        }
        return b;
    }

    public static int podciag(int[] tab)
    {
        int a = tab.length;
        int len, last;
        if(a > 0)
        {
            len = 1;
            last = 1;
        }
        else
        {
            len = 0;
            last = 0;
        }
        for(int i = 1; i < a; i++)
        {
            if(tab[i] < tab[i - 1])
            {
                last++;
                if(last > len) len = last;
            }
            else last = 1;
        }
        return len;
    }

    public static int podciag(int[] tab, int r)
    {
        int a = tab.length;
        int len, last;
        len = 0;
        last = 0;
        for(int i = 1; i < a; i++)
        {
            if(tab[i - 1] - tab[i] == r)
            {
                last++;
                if(last > len) len = last;
            }
            else last = 1;
        }
        if(a > 1) return len + 1;
        else return len;
    }

    public static boolean czyPalindrom(int n)
    {
        int m = n;
        int pow = 1;
        double rev = 0;
        while(m % Math.pow(10, pow) != n) pow++;
        while(m != 0)
        {
            pow--;
            rev += (m % 10) * Math.pow(10, pow);
            m /= 10;
        }
        if(rev == n) return true;
        else return false;
    }

    public static void palindromLiczbowy(int m)
    {
        double pow = Math.pow(10, m - 1);
        for(double a = pow; a < pow * 10; a++)
        {
            boolean c = false;
            for(double b = pow; b < pow * 10; b++)
            {
                if(czyPalindrom((int)(a * b)))
                {
                    c = true;
                    System.out.println((int)a + " x " + (int)b + " = " + (a * b));
                    break;
                }
            }
            if(c) break;
        }
    }

    public static void main(String[] args)
    {
        System.out.println(dokladnosc(4.1, 4, 1));
        System.out.println(dokladnosc(4.01, 4, 2));
        System.out.println(najblizszySasiad(20));
        System.out.println(najblizszySasiad(25));
        System.out.println(pierwiastek(25, 2, 3));
        System.out.println(pierwiastek(27, 3, 3));
        System.out.println(podciag(new int[]{1, 5, 3, 2, 4, 7, 6, 9}));
        System.out.println(podciag(new int[]{9, 6, 3, 0, 4, 3, 2 ,1, 6, 3, 0, 9}, 3));
        System.out.println(czyPalindrom(12321));
        System.out.println(czyPalindrom(123421));
        System.out.println(czyPalindrom(124421));
        palindromLiczbowy(4);
    }
}