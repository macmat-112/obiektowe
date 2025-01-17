import java.util.ArrayList;

public class Counter<T>
{
    public ArrayList<T> elements = new ArrayList<T>();

    public void add(T element)
    {
        this.elements.add(element);

    }

    public int getCount()
    {
        return this.elements.size();
    }
}
