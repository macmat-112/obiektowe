package zad3;

public class AudioPlayer implements MediaPlayer
{
    public String name = "";

    public void play(String trackName)
    {
        this.name = trackName;
        System.out.println("Playing " + trackName + "...");
    }

    public void pause()
    {
        if(this.name.isEmpty()) System.out.println("Nothing to pause!");
        else
        {
            this.name = "";
            System.out.println("Pausing...");
        }
    }

    public String getCurrentTrack()
    {
        return this.name;
    }
}
