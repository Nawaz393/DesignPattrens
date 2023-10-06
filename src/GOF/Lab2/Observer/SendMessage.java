package GOF.Lab2.Observer;

import java.util.ArrayList;
import java.util.List;

public class SendMessage {
    List<Observer> observers =new ArrayList<>();
    private  String message;

    public String getMessage(){
        return  message;
    }
    public  void setMessage (String message){
        this.message=message;
        notifyAllObservers();
    }
    public void attach(Observer observer){
        observers.add(observer);
    }
    public  void detach(Observer observer){
        observers.remove(observer);
    }
    public void notifyAllObservers(){
        for(Observer observer:observers ){
            observer.update();
        }
    }
}
