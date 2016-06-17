package our.game.edmond;

import java.io.File;
import javax.sound.sampled.*;

public class Sound {
	static public void MortalSound() {
		try {
			AudioInputStream stream = AudioSystem.getAudioInputStream(new File(
					"C:/Users/Acer/Desktop/Mortal_Kombat.wav"));

			// AudioFormat format = stream.getFormat();
			DataLine.Info info = new DataLine.Info(Clip.class,
					stream.getFormat());
			Clip clip = (Clip) AudioSystem.getLine(info);

			clip.open(stream);
			clip.start();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}