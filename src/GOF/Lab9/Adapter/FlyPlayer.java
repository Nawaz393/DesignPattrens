package GOF.Lab9.Adapter;

public class FlyPlayer extends AdvancedMediaPlayer {

    @Override
    public void playFly(String fileName) {
        System.out.println("Playing Mov file. Name: " + fileName);
    }
}
