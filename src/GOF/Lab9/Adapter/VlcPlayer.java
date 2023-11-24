package GOF.Lab9.Adapter;

public class VlcPlayer extends AdvancedMediaPlayer {
   @Override
   public void playVlc(String fileName) {
      System.out.println("Playing vlc file. Name: " + fileName);
   }

}