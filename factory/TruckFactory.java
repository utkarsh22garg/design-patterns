package factory;

public class TruckFactory implements TransportCreator {
    public Transport createTransport() {
        return new Truck();
    }
}
