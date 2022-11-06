package Lab_4;

public class SmsAdapter implements ISmsNotification{

    NotificationLab notify;

    public SmsAdapter(NotificationLab notify){
        this.notify = notify;
    }

    public void smsSend(String title, String message){
        notify.send(title, message);
    }

}
