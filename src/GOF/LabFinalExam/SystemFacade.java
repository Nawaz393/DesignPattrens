package GOF.LabFinalExam;

public class SystemFacade {
    private CommunicationStrategy communicationStrategy;

    public SystemFacade(CommunicationStrategy strategy) {
        this.communicationStrategy = strategy;
    }

    public void sendCommunication(Message message) {
        communicationStrategy.executeStrategy(message);
    }

    public void broadcastAnnouncement(Announcement announcement) {
        System.out.println("Broadcasting announcement: " + announcement.getMessage());
    }
}
