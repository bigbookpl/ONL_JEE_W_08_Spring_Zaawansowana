package pl.coderslab.day1.designpatterns.task4;

public interface Subject {


    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObservers();


}