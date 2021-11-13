package pl.coderslab.day1.designpatterns.task4;

public class FacebookObserver implements Observer{
    @Override
    public void update(String title) {
        System.out.println("Facebook powiadomienie: "+title);
    }
}
