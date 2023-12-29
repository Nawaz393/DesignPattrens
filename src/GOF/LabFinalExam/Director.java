package GOF.LabFinalExam;

public class Director {
    public void constructMessage(MessageBuilder builder, String content, Stakeholder sender, Stakeholder receiver) {
        builder.buildContent(content);
        builder.buildTimestamp();
        builder.buildSender(sender);
        builder.buildReceiver(receiver);
    }
}

