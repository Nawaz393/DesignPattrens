package GOF.LabFinalExam;

public class Parent extends Stakeholder {

    public Parent(String name, Integer id) {
        this.name = name;
        this.id = id;


    }

    @Override
    public void sendMessage(Message message, NotificationSystem notificationSystem) {
        notificationSystem.notifyUpdate(new Notification("Parent sent a message: " + message.getContent()));
    }

    @Override
    public void receiveNotification(Notification notification) {
        System.out.println("Parent received notification: " + notification.getContent());
    }


}
