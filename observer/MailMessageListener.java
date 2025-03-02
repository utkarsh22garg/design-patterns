package observer;

public class MailMessageListener implements EventListener {
    private String username;

    public MailMessageListener(String email) {
        username = email;
    }

    @Override
    public void update(EventType event, String message) {
        System.out.println("Received event: " + event + " with message: " + message + " via email " + username);
    }
}
