package Lab2.Observer;

public class User1 extends Observer {

    public  User1 (SendMessage sendMessage){
        this.sendMessage=sendMessage;
        this.sendMessage.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Message from User 1: "+sendMessage.getMessage());
    }
}
