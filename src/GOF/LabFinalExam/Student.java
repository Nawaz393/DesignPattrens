package GOF.LabFinalExam;

public class Student extends Stakeholder {
    public Student(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void sendMessage(Message message, NotificationSystem notificationSystem) {
        notificationSystem.notifyUpdate(new Notification("Student sent a message: " + message.getContent()));
    }

    @Override
    public void receiveNotification(Notification notification) {
        System.out.println("Student received notification: " + notification.getContent());
    }
}
