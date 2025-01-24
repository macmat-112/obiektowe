package zad4;

public class Test
{
    public static void main(String[] args)
    {
        Storage<Integer> a = new Storage<>();
        Storage<Character> b= new Storage<>();

        a.store(123);
        b.store('A');

        System.out.println(a.retrieve());
        System.out.println(b.retrieve());
    }
}
