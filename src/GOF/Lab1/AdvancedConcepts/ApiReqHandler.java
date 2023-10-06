package GOF.Lab1.AdvancedConcepts;

public class ApiReqHandler {


    public static void main(String[] args) throws InterruptedException {
        ApiReqFunctions multiThreading=new ApiReqFunctions();
        Thread t1=new Thread(()-> {
            try {
                multiThreading.apiRequest1();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2=new Thread(()-> {
            try {
                multiThreading.apiRequest2();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t2.start();
    }
}
