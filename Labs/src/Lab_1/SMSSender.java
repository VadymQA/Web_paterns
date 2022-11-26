package Lab_1;

import java.util.List;

public class SMSSender implements iSender {
    @Override
    public void send(String text, List<User> users) {
        System.out.println("Message " + text + " was send by SMS");
    }
}
