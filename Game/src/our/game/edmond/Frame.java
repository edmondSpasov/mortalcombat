package our.game.edmond;

import javax.swing.*;

public class Frame {

	public Frame() {
		JFrame frame = new JFrame();
		frame.add(new Board());
		frame.setTitle("2-D Test Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700, 365);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new Frame();
		Sound.MortalSound();
	}

}
