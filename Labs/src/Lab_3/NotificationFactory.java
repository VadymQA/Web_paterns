package Lab_3;

public class NotificationFactory {
//    public Notification createNotification(String channel, String user, String password) {
    public Notification createNotification(String user, String password) {

        if (user.isEmpty()) {return null;}
        else if (user.contains("@")) {
            new LinkedinConnection (user, password);
            return new LinkedinNotication(user, password);
        }
        else {
            new FacebookConnection(user, password);
            return new FacebookNotification(user, password);
        }

    }
}
