package adapter;

public class AdapterDemo {
    public static void main(String args[]) {
        String filename = "wavy.sonio";
        AudioPlayer carPlayer = new AudioPlayer();
        carPlayer.play(filename);
    }
}
