package Lab1.AdvancedConcepts;

// this class demonstrate the concept of multi threading
public class ApiReqFunctions {



    public void apiRequest1() throws InterruptedException {

        Thread.sleep(2000);


            System.out.println("api req 1 is completed");



    }

    public void apiRequest2() throws InterruptedException {
        Thread.sleep(2000);


        System.out.println("api req 2 is completed");


    }

}
