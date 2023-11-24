package GOF.Lab9.Adapter;

public class Mp4Player extends AdvancedMediaPlayer{

   @Override
   public void playMp4(String fileName) {
      System.out.println("Playing mp4 file. Name: "+ fileName);		
   }
}