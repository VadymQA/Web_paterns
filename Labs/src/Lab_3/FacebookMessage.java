package Lab_3;

public class FacebookMessage implements Message {
    @Override
    public void send() {
        System.out.println("Facebook message. 'Hello World!'");
    }
}
