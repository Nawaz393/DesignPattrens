package GOF.LabFinalExam;

public abstract class MessageBuilder {
    protected Message message;

    public MessageBuilder() {
        message = new Message();
    }

    public abstract void buildContent(String content);
    public abstract void buildTimestamp();
    public abstract void buildSender(Stakeholder sender);
    public abstract void buildReceiver(Stakeholder receiver);

    public Message getMessage() {
        return message;
    }
}
