package adapter;

public class Mp3MediaPlayer implements MediaPlayer {
    @Override
    public void play() {
        System.out.println("Playing mp3 media");
    }
}
