package Lab_3;

public class Main {
    private static SocialNetworks social;

    public static void main(String[] args) {
        configure();
        dosomething();
    }

    static void configure() {
        if (System.getProperty("social").equals("Facebook")) {
            social = new Facebook(login, password);
        } else {
            social = new LinkedIN(email, passwrod);
        }
    }

    static void dosomething() {
        social.login();
        social.createMessage();
    }
}
