package pl.coderslab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.beans.HelloWorld;
import pl.coderslab.beans.NotificationService;
import pl.coderslab.config.AppConfig;

public class SpringDiApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);
//        helloWorld.printMessage();

        NotificationService smsService = context.getBean("smsServ", NotificationService.class);
        smsService.sendNotification();

    }
}
