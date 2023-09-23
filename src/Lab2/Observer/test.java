package Lab2.Observer;

public class test {

    public static void main(String[] args) throws InterruptedException {

        SendMessage sendMessage = new SendMessage();
        User1 user1 = new User1(sendMessage);
        User2 user2 = new User2(sendMessage);
        User3 user3 = new User3(sendMessage);
        String[] messages = {"this message 1", "this message 2", "this message 3", "this message 4", "this message 5", "this message 6", "this message 7", "this message 8", "this message 9", "this message 10"};
        for (int i = 0; i < 10; i++) {
            Thread.sleep(3000);
            sendMessage.setMessage(messages[i]);

            if(i==5){
                sendMessage.detach(user1);
                System.out.println("user 1 left the room");
            }
            if(i==8){
                sendMessage.detach(user2);
                System.out.println("user 2 left the room");
            }
        }
    }
}
