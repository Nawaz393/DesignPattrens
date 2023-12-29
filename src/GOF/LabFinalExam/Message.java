package GOF.LabFinalExam;

import java.sql.Timestamp;
import java.util.Date;



public class Message {
    private String content;
    private Date timestamp;
    private Stakeholder sender;
    private Stakeholder receiver;

 


    public Message(String content){

        this.content=content;
        timestamp=new Timestamp(System.currentTimeMillis());
    }

    public  Message(){}
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Stakeholder getSender() {
        return sender;
    }

    public void setSender(Stakeholder sender) {
        this.sender = sender;
    }

    public Stakeholder getReceiver() {
        return receiver;
    }

    public void setReceiver(Stakeholder receiver) {
        this.receiver = receiver;
    }
}
