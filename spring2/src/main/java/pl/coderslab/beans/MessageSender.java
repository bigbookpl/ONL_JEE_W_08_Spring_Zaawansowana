package pl.coderslab.beans;

public class MessageSender {

    NotificationService notificationService;

    public MessageSender(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void send(){
        notificationService.sendNotification();
    }
}
