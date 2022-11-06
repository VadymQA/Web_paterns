package Lab_3;

public abstract class SocialNetworks {

    public void sendMessage() {
        // some code

        Message msg = createMessage();
        msg.send();
    }

    public abstract Message createMessage();


    public void log_in() {
        // some code

        Login log = login();
        log.login();
    }

    public abstract Login login();

}