package GOF.Lab9.Adapter;

public class MovPlayer extends AdvancedMediaPlayer {

    @Override
    public void playFly(String fileName) {

        System.out.println("Playing Move file. Name: " + fileName);

    }

}