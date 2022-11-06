package Lab_3;


public class LinkedIN extends SocialNetworks {

    @Override
    public Message createMessage() {

        return new LinkedINMessage();
    }

    @Override
    public Login login(email, password) {
        return new LinkedLogin();
    }
}