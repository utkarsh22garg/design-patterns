package decorator;

public class WhatsappNotifier extends BaseNotifierDecorator {

    public WhatsappNotifier(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void notify(String message) {
        super.notify(message);
        System.out.println("Sending Whatsapp notification with message: " + message);
    }
}
