package adapter;

public class VLCMediaPlayer implements AdvancedMediaPlayer {
    @Override
    public void playAdvanced() {
        System.out.println("Playing advanced vlc media");
    }
}
