package Lab_4;

public class SlackAdapter implements ISlackNotification{

    NotificationLab notify;

    public SlackAdapter(NotificationLab notify){
        this.notify = notify;
    }
    @Override
    public void slackSend(String title, String message){

        notify.send(title, message);
    }
}
