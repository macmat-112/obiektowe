package zad4;

public class Storage<T>
{
    private T item;

    public void store(T item)
    {
        this.item = item;
    }

    public T retrieve()
    {
        return this.item;
    }
}
