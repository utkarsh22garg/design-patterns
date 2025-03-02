package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationService {
    private final Map<EventType, List<EventListener>> customers = new HashMap<>();

    public NotificationService() {
        for (EventType eventType : EventType.values()) {
            customers.put(eventType, new ArrayList<>());
        }
    }

    public void subscribe(EventType event, EventListener customer) {
        customers.get(event).add(customer);
    }

    public void unsubscribe(EventType event, EventListener customer) {
        customers.get(event).remove(customer);
    }

    public void update(EventType event, String message) {
        for (EventListener customer : customers.get(event)) {
            customer.update(event, message);
        }
    }

}
