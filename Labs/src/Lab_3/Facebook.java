package Lab_3;

public class Facebook extends SocialNetworks {

    @Override
    public Message createMessage() {

        return new FacebookMessage();
    }

    @Override
    public Login login() {
        return new FacebookLogin(login, password);
    }
}