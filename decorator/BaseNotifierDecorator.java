package decorator;

public abstract class BaseNotifierDecorator implements INotifier {
    private final INotifier wrapper;

    public BaseNotifierDecorator(INotifier wrapped) {
        wrapper = wrapped;
    }

    @Override
    public void notify(String message) {
        wrapper.notify(message);
    }
}
