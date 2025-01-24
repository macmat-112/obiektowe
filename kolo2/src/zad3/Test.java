package zad3;

public class Test
{
    public static void main(String[] args)
    {
        AudioPlayer a = new AudioPlayer();
        VideoPlayer v = new VideoPlayer();

        a.play("costam.mp3");
        System.out.println(a.getCurrentTrack());
        a.pause();
        a.pause();

        System.out.println("\n");

        v.play("ble.mp4");
        System.out.println(v.getCurrentTrack());
        v.pause();
        v.pause();
    }
}
