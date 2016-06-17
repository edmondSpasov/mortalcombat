package our.game.edmond;

import java.awt.*;

import javax.swing.ImageIcon;

public class Bullet {

	int x, y;
	Image img;
	boolean visible;

	public Bullet(int startX, int startY) {
		x = startX;
		y = startY;
		ImageIcon newBullet = new ImageIcon(
				"C:/Users/Acer/workspace/Game/src/Mortal_K/bullet.png");
		img = newBullet.getImage();
		visible = true;
	}

	public Rectangle getBounds() {
		return new Rectangle(x, y, 75, 35);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Image getImage() {
		return img;
	}

	public boolean getVisible() {
		return visible;
	}

	public void move() {
		x = x + 2;
		if (x > 700)
			visible = false;
	}
}
