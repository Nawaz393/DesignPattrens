package Lab1.OopRevision;

// this class demonstrate polymorphism
public class DataBaseConnectivity {


    public void connectToDatabase(String url){
        System.out.println("connected to database using url: "+url);
    }

    public  void connectToDatabase(String name,String pass){
        System.out.println("connected to database using user Name: " +name+ "and password: "+pass);
    }

    public  void connectToDatabase(){
        System.out.println("connected to default database using url: jdbc:mysql://localhost:3306/mydb");
    }

}
