package pl.coderslab.day1.designpatterns.task4;

public class TwitterObserver implements Observer{

    @Override
    public void update(String title) {
        System.out.println("Twitter powiadomienie: "+title);
    }
}
