package GOF.LabFinalExam;

public class SevereCommunication implements CommunicationStrategy {
    @Override
    public void executeStrategy(Message message) {
        System.out.println("Sending severe message: " + message.getContent());

    }
}