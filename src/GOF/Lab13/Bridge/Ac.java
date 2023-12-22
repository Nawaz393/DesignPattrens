package GOF.Lab13.Bridge;

public class Ac implements Device {


    private boolean on = false;
    private int temperature = 30;
    private int channel = 1;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public int getVolume() {
        return temperature;
    }

    @Override
    public void setVolume(int volume) {
        if (volume > 100) {
            this.temperature = 100;
        } else this.temperature = Math.max(volume, 0);
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm Ac set.");
        System.out.println("| I'm " + (on ? "enabled" : "disabled"));
        System.out.println("| temperature is is " + temperature /3 + "c");
        System.out.println("| Current channel is " + channel);
        System.out.println("------------------------------------\n");
    }
}
