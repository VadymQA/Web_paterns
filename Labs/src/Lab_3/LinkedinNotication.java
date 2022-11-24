package Lab_3;

public class LinkedinNotication implements Notification{


    public LinkedinNotication(String email, String password) {
    }

    @Override
    public void sendNMessage(String message) {
        System.out.println("Message from Linedin: "+ message);

    }
}
