package zad3;

public interface MediaPlayer
{
    public abstract void play(String trackName);

    public abstract void pause();

    public abstract String getCurrentTrack();
}
