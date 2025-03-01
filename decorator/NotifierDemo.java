package decorator;

public class NotifierDemo {
    public static void main(String args[]) {
        INotifier notifier = new WhatsappNotifier(new WhatsappNotifier(new Notifier("gargut")));
        notifier.notify("Hello Sir ! How may I help you ?");
    }
}
