package GOF.LabFinalExam;

public abstract class Stakeholder {
    protected String name;
    protected Integer id;

    public abstract void sendMessage(Message message, NotificationSystem notificationSystem);
    public abstract void receiveNotification(Notification notification);
}
