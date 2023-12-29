package GOF.LabFinalExam;



import java.util.ArrayList;
import java.util.List;

public class NotificationSystem {
    private List<Stakeholder> observers = new ArrayList<>();

    public void attach(Stakeholder observer) {
        observers.add(observer);
    }

    public void detach(Stakeholder observer) {
        observers.remove(observer);
    }

    public void notifyUpdate(Notification notification) {
        for (Stakeholder observer : observers) {
            observer.receiveNotification(notification);
        }
    }
}

