package Lab_4;

public class SlackNotification implements ISlackNotification {
    private String login;
    private String apiKey;

    public SlackNotification(String login, String apiKey) {
        this.login = login;
        this.apiKey = apiKey;
    }

    @Override
    public void slackSend(String title, String message) {
        System.out.println(title + " - title, message:" + message + ", to- " + login);
    }
}
