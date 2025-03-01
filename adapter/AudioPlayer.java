package adapter;

public class AudioPlayer {
    MediaPlayer player;

    void play(String filename) {
        if (filename.contains("mp3")) {
            player = new Mp3MediaPlayer();
        } else if (filename.contains("vlc") || filename.contains("sonic")) {
            player = new MediaAdapter(filename);
        }
        if (player != null) {
            player.play();
        } else {
            System.out.println("Unsupported file format: " + filename);
        }
    }
}
