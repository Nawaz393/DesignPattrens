package GOF.LabFinalExam;

public class Teacher extends Stakeholder {

    public Teacher(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void sendMessage(Message message, NotificationSystem notificationSystem) {
        notificationSystem.notifyUpdate(new Notification("Teacher sent a message: " + message.getContent()));
    }

    @Override
    public void receiveNotification(Notification notification) {
        System.out.println("Teacher received notification: " + notification.getContent());
    }

    public void createAnnouncement(Announcement announcement, SystemFacade systemFacade) {
        systemFacade.broadcastAnnouncement(announcement);
    }
}