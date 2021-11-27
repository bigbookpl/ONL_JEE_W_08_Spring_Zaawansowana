package pl.coderslab.beans;

public class HelloWorld {

    private String message;

    public HelloWorld(String message) {
        System.out.println("Konstruktor HelloWorld - "+message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        System.out.println("Setter HelloWorld - "+message);
        this.message = message;
    }

    public void printMessage() {
        System.out.println("Your Message : " + message);
    }

}
