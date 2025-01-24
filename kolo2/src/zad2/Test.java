package zad2;

public class Test
{
    public static void main(String[] args)
    {
        Bitmap b = new Bitmap();
        Vector v = new Vector();

        b.saveFile();
        b.loadFile();
        v.saveFile();
        v.loadFile();
    }
}
