package builder;

public class Director {
    private Builder builder;

    public Director(Builder newBuilder) {
        builder = newBuilder;
    }

    void make() {
        builder.reset();
        builder.buildWalls();
        builder.buildWalls();
        builder.buildWalls();
        builder.buildWalls();
        builder.buildDoor();
        builder.buildPool();
        System.out.println("Dream house created");
    }
}
