package decorator;

public class Notifier implements INotifier {
    private final String username;

    public Notifier(String user) {
        username = user;
    }

    @Override
    public void notify(String message) {
        System.out.println("Hey " + username + " here is your message: " + message);
    }
}
