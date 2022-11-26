package Lab_1;

import java.util.List;

public class EmailSender implements iSender {
    @Override
    public void send(String text, List<User> users) {
        //some code
        System.out.println("Message " + text + " was send by EMAIL");
    }
}
