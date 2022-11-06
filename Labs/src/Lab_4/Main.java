package Lab_4;

public class Main {
    public static void main(String[] args) {
        // Round fits round, no surprise.

        EmailNotification email = new EmailNotification("123@gmail.com");

        SlackNotification slack = new SlackNotification("user123", "apiKey");
        SmsNotification sms = new SmsNotification("131313213", "Adam");

        ISlackNotification slackAdapter = new SlackAdapter(email);
        ISmsNotification smsAdapter = new SmsAdapter(email);

        System.out.println("Email...");
        email.send("Title", "Message");

        System.out.println("Slack...");
        slack.slackSend("TitleSlack", "MessageSlack");

        System.out.println("SMS....");
        sms.smsSend("TitleSMS", "MessageSMS");


    }
}
