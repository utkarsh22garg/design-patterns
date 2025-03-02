package observer;

public class ObserverDemo {
    public static void main(String args[]) {
        Store store = new Store();
        store.NOTIFICATION_SERVICE.subscribe(EventType.NEW_ITEM, new MailMessageListener("example@rediffmail.com"));
        store.getNewItemPromotion("Bugatti");
    }
}
