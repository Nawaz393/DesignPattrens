package GOF.LabFinalExam;

import java.util.Date;

public class ConcreteMessageBuilder extends MessageBuilder {

    @Override
    public void buildContent(String content) {
        message.setContent(content);
    }

    @Override
    public void buildTimestamp() {
        message.setTimestamp(new Date()); // Sets the current timestamp
    }

    @Override
    public void buildSender(Stakeholder sender) {
        message.setSender(sender);
    }

    @Override
    public void buildReceiver(Stakeholder receiver) {
        message.setReceiver(receiver);
    }
}

