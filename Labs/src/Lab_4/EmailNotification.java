package Lab_4;

public class EmailNotification implements NotificationLab {

    private String adminEmail;

    public EmailNotification(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    @Override
    public void send(String title, String message) {
        System.out.println(title + " - title, message:" + message + ", to- " + adminEmail);

//        mail($this->adminEmail, $title, $message);
//        echo "Sent email with title '$title' to '{$this->adminEmail}' that
//        says '$message'.";

    }
}
