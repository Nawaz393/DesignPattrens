package GOF.Lab9.Command.SubExpertExample;

//Concrete Command

public class LightOffCommand implements Command {

    // reference to the light
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.switchOff();
        System.out.println("Light is off");
    }

}