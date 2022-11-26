package Lab_1;

import java.util.List;

public class MessagerSender implements iSender {
    @Override
    public void send(String text, List<User> users) {
        //some code
        System.out.println("Message " + text + " in messager was send");
    }
}
