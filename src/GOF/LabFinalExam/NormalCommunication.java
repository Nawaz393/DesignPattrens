package GOF.LabFinalExam;

public class NormalCommunication implements CommunicationStrategy {
    @Override
    public void executeStrategy(Message message) {
        System.out.println("Sending normal message: " + message.getContent());

    }
}
