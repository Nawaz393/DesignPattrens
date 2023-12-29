package GOF.LabFinalExam;

public class Administrator extends Stakeholder {

    public Administrator(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void sendMessage(Message message, NotificationSystem notificationSystem) {
        notificationSystem.notifyUpdate(new Notification("Administrator sent a message: " + message.getContent()));
    }

    @Override
    public void receiveNotification(Notification notification) {
        System.out.println("Administrator received notification: " + notification.getContent());
    }

   public void createPolicy(String policy) {
       System.out.println("Administrator created a new policy: " + policy);
   }
}

