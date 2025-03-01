package adapter;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String fileName) {
        if (fileName.contains("vlc")) {
            advancedMediaPlayer = new VLCMediaPlayer();
        } else if (fileName.contains("sonic")) {
            advancedMediaPlayer = new SonicMediaPlayer();
        } else {
            advancedMediaPlayer = null;
        }
    }

    @Override
    public void play() {
        if (advancedMediaPlayer == null) {
            System.out.println("Can't play unknown file");
            return;
        }
        System.out.println("Playing via media adapter");
        advancedMediaPlayer.playAdvanced();
    }
}
