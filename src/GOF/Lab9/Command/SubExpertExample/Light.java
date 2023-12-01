package GOF.Lab9.Command.SubExpertExample;

//Receiver

public class Light {

    private boolean isOn;

    public void switchOn() {
        isOn = true;
    }

    public void switchOff() {
        isOn = false;
    }

    public boolean getStatus(){
        return this.isOn;
    }
}
