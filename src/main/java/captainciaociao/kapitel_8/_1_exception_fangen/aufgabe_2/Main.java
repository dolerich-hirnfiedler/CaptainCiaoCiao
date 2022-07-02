package captainciaociao.kapitel_8._1_exception_fangen.aufgabe_2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {
    public static void main(String[] args) {
        try (Clip clip = AudioSystem.getClip()) {
            clip.open(AudioSystem.getAudioInputStream(
                    new File(
                            "/Users/dolerich_hirnfielder/CaptainCiaoCiao/src/main/java/captainciaociao/kapitel_8/_1_exception_fangen/Evil_Laugh_Cackle-SoundBible.com-957382653.wav")));
            clip.start();
            TimeUnit.MICROSECONDS.sleep(clip.getMicrosecondLength() + 50);
            clip.close();
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException | InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
