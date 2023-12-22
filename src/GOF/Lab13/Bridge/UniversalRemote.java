package GOF.Lab13.Bridge;

public class UniversalRemote extends  BasicRemote{


    public  UniversalRemote(Device device){
        super.device=device;
    }

    public void maxVolume(){
        System.out.println("Remote: Max volume");
        device.setVolume(device.getVolume() + 100);
    }

}
