package GOF.Lab9.Command.SubExpertExample;

public class Demo {

    public static void main(String[] args) {

        RemoteControl control = new RemoteControl();
        Light light = new Light();
        Command lightsOn = new LightOnCommand(light);
        Command lightsOff = new LightOffCommand(light);
        Command lightReplace=new LightReplaceCommand(light);


        // switch on


        System.out.println(light.getStatus()?"Status:light is on":"Status:light is off");
        control.setCommand(lightsOn);
        control.pressButton();
        System.out.println(light.getStatus()?"Status:light is on":"Status:light is off");
        // switch off
        control.setCommand(lightsOff);
        control.pressButton();
          System.out.println(light.getStatus()?"Status:light is on":"Status:light is off");
        System.out.println("Changing status using LightReplace");
          control.setCommand(lightReplace);
          control.pressButton();








        






      

    }

}