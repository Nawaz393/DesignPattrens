package GOF.Lab9.Adapter;

public class AudioPlayer implements MediaPlayer {
   MediaAdapter mediaAdapter;

   @Override
   public void play(String audioType, String fileName) {

      // inbuilt support to play mp3 music files
      if (audioType.equalsIgnoreCase("mp3")) {
         System.out.println("Playing mp3 file. Name: " + fileName);
      }
      if (audioType.equalsIgnoreCase("avi")) {
         System.out.println("Playing avi file. Name: " + fileName);
      }

      // mediaAdapter is providing support to play other file formats
      else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")
            || audioType.equalsIgnoreCase("mov") || audioType.equalsIgnoreCase("fly")) {
         mediaAdapter = new MediaAdapter(audioType);
         mediaAdapter.play(audioType, fileName);
      }

      else {
         System.out.println("Invalid media. " + audioType + " format not supported");
      }
   }
}