package pl.coderslab.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

    private String message;

    public HelloWorld() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        System.out.println("Setter HelloWorld - "+message);
        this.message = message;
    }

    public void printMessage() {
        System.out.println("Your Message");
    }

}
