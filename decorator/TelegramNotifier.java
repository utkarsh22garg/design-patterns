package decorator;

public class TelegramNotifier extends BaseNotifierDecorator {
    public TelegramNotifier(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void notify(String message) {
        super.notify(message);
        System.out.println("Sending Telegram notification: " + message);
    }
}
