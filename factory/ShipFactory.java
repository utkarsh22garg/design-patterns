package factory;

public class ShipFactory implements TransportCreator {
    public Transport createTransport() {
        return new Ship();
    }
}
