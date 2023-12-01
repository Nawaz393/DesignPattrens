package GOF.Lab9.Command.SubExpertExample;

public class LightReplaceCommand implements Command {

    private Light light;

    public LightReplaceCommand(Light light) {
        this.light = light;

    }

    @Override
    public void execute() {

        boolean status = light.getStatus();

        if (status) {
            light.switchOff();
            System.out.println("light is off");
        } else {

            light.switchOn();
            System.out.println("light is on ");

        }

    }

}
