package Lab_4;

public class SmsNotification implements ISmsNotification {
    public String phone;
    public String sender;

    public SmsNotification(String phone, String sender) {
        this.phone = phone;
        this.sender = sender;
    }

    @Override
    public void smsSend(String title, String message) {
        System.out.println(title + " - title, message:" + message + ", to- " + phone + " from " + sender);
    }
}
