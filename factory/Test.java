package factory;

public class Test {
    public static void main(String[] args) {
        TransportCreator shipFactory = new ShipFactory();
        TransportCreator truckFactory = new TruckFactory();
        Transport ship = shipFactory.createTransport();
        Transport truck = truckFactory.createTransport();
        ship.deliver();
        truck.deliver();
    }
}
