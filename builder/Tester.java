package builder;

public class Tester {
    public static void main(String args[]) {
        DreamHouseBuilder builder = new DreamHouseBuilder();
        Director director = new Director(builder);

        director.make();
    }
}
