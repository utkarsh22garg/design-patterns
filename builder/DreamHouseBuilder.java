package builder;

public class DreamHouseBuilder implements Builder {
    @Override
    public void buildDoor() {
        System.out.println("Dream house door created");
    }

    @Override
    public void buildPool() {
        System.out.println("Dream house pool created");
    }

    @Override
    public void buildWalls() {
        System.out.println("Dream house wall created");
    }

    @Override
    public void reset() {
        System.out.println("Flat land again");
    }
}
