package facade;

public class HardDrive {
    void saveToDisk() {
        System.out.println("Saving data to disk");
    }

    void loadFromDisk(String program) {
        System.out.println("Loading " + program + " from disk");
    }
}
