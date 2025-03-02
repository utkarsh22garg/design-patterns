package observer;

public class Store {
    public final NotificationService NOTIFICATION_SERVICE = new NotificationService();

    void getNewItemPromotion(String item) {
        NOTIFICATION_SERVICE.update(EventType.NEW_ITEM, item + " has arrived");
    }
}
