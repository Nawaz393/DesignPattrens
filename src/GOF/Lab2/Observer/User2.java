package GOF.Lab2.Observer;

public class User2 extends  Observer{


    public  User2(SendMessage sendMessage){

        this.sendMessage=sendMessage;
        this.sendMessage.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Message from User 1: "+sendMessage.getMessage());
    }
}
