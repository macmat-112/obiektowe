package zad1;

public class House extends Building
{
    public int numberOfRooms;

    public House(int a, String b, int c)
    {
        super(a, b);
        this.numberOfRooms = c;
    }
}
