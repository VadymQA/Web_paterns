package Lab_3;

public class Main {
    public static void main(String[] args) {

        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification( "Ilon Mask", "Pass1234");
        notification.sendNMessage("Goodbye FB, i've bought Twitter!!!");

        Notification notification2 = notificationFactory.createNotification("test@test.com", "Pass1234");
        notification2.sendNMessage("Hey!!");
    }

}
