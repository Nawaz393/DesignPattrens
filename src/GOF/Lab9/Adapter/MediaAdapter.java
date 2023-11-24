package GOF.Lab9.Adapter;

public class MediaAdapter implements MediaPlayer {

   AdvancedMediaPlayer advancedMusicPlayer;

   public MediaAdapter(String audioType) {

      if (audioType.equalsIgnoreCase("vlc")) {
         advancedMusicPlayer = new VlcPlayer();

      } else if (audioType.equalsIgnoreCase("mp4")) {
         advancedMusicPlayer = new Mp4Player();
      } else if (audioType.equalsIgnoreCase("mov")) {

         advancedMusicPlayer = new MovPlayer();
      } else if (audioType.equalsIgnoreCase("fly")) {
         advancedMusicPlayer = new FlyPlayer();
      }
   }

   @Override
   public void play(String audioType, String fileName) {

      // if (audioType.equalsIgnoreCase("vlc")) {
      // advancedMusicPlayer.playVlc(fileName);
      // } else if (audioType.equalsIgnoreCase("mp4")) {
      // advancedMusicPlayer.playMp4(fileName);
      // }

      switch (audioType.toLowerCase()) {
         case "vlc":
            advancedMusicPlayer.playVlc(fileName);
            break;
         case "mp4":
            advancedMusicPlayer.playMp4(fileName);
            break;
         case "mov":
            advancedMusicPlayer.playMov(fileName);
            break;
         case "fly":
            advancedMusicPlayer.playFly(fileName);
            break;
         default:
            break;
      }

   }
}