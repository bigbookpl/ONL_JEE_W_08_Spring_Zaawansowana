package pl.coderslab.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("emailServ")
public class EmailService implements NotificationService{
    @Override
    public void sendNotification() {
        System.out.println("Wyslij emaila");
    }
}
