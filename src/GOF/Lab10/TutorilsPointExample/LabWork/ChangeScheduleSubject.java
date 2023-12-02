package GOF.Lab10.TutorilsPointExample.LabWork;

import java.util.ArrayList;
import java.util.List;

public class ChangeScheduleSubject {

    List<Observer> observers;
    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }

    public ChangeScheduleSubject() {
        this.observers = new ArrayList<>();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(message);
        }

    }

}
