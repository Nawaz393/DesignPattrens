package GOF.Lab4.TemplateMethod;

public class Message {

    String description;
    MessageType messageType;
    NetworkType netwrokType;

    public Message(String description, MessageType messageType, NetworkType netwrokType) {
        this.description = description;
        this.messageType = messageType;
        this.netwrokType = netwrokType;

    }

    public String getDescription() {
        return description;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public NetworkType getNetwrokType() {
        return netwrokType;
    }

    public String toString() {

        return "Message{" +
                "description='" + description + '\'' +
                ", messageType=" + messageType +
                ", netwrokType=" + netwrokType +
                '}';

    }

}
