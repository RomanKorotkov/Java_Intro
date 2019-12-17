package Music;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.io.File;
public class Stuff {
    public void playMusic(String musicLocation){
        try{
            File musicPath = new File(musicLocation);
            if(musicPath.exists()){
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);

                JOptionPane.showMessageDialog(null, "Pause");
                long clipTimePosition = clip.getMicrosecondPosition();
                clip.stop();

                JOptionPane.showMessageDialog(null, "Resume");
                clip.setMicrosecondPosition(clipTimePosition);
                clip.start();

                JOptionPane.showMessageDialog(null, "Stop");
            } else{
                System.out.println("Can't find file");
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
