package Lab_3;

public class FacebookNotification implements Notification{


    private String login;
    private String password;

    public FacebookNotification(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public void sendNMessage(String message) {

        System.out.println("Send by: " + login +  " Message from FB: " + message);

    }

}
