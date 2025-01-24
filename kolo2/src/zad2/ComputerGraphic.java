package zad2;

public abstract class ComputerGraphic
{
    public int width;
    public int height;
    public String fileName;

    public abstract void loadFile();

    public abstract void saveFile();
}
