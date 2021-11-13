package pl.coderslab.day1.designpatterns.task4;

import java.util.ArrayList;
import java.util.List;

public class Post implements Subject{

    private String content;
    private String title;
    private List<Observer> observerList;

    public Post() {
        observerList = new ArrayList<>();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }
    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observerList){
            observer.update(title);
        }
    }

    public void share() {
        System.out.println("UPDATE OBSERVERS");
        notifyObservers();
    }


}
