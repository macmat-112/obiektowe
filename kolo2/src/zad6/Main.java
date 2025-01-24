package zad6;

import java.util.Comparator;
import java.util.Arrays;

public class Main
{
    public static <T extends Comparable<T>> void sortDescending(T[] array)
    {
        Arrays.sort(array, Comparator.reverseOrder());
    }

    public static void main(String[] args)
    {
        Integer[] a1 = {3, 1, 76, 34, 8, 21, 5, 3, 90, 9};
        Character[] a2 = {'c', 'b', 'e', 'z', 'y', 'z', 'a', 'd', 'f', 'j'};

        sortDescending(a1);
        sortDescending(a2);

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
    }
}
