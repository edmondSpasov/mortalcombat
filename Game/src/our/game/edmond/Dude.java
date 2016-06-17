package our.game.edmond;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Dude {

	int x, dx, y, nx2, nx, left, dy;
	Image Mortal_K1;

	int ammo = 10;

	ImageIcon i = new ImageIcon(
			"C:/Users/Acer/workspace/Game/src/Mortal_K/Mortal_K1.png");
	ImageIcon l = new ImageIcon(
			"C:/Users/Acer/workspace/Game/src/Mortal_K/Mortal_K2.png");
	ImageIcon j = new ImageIcon(
			"C:/Users/Acer/workspace/Game/src/Mortal_K/Mortal_K3.png");

	static ArrayList bullets;

	public Dude() {
		Mortal_K1 = i.getImage();
		left = 150;
		x = 75;
		nx2 = 685;
		nx = 0;
		y = 172;
		bullets = new ArrayList();
	}

	public Rectangle getBounds() {
		return new Rectangle(left, y, 320, 180);
	}

	public static ArrayList getBullets() {
		return bullets;
	}

	public void fire() {
		if (ammo > 0) {
			ammo--;
			Bullet z = new Bullet((left + 60), (y + 154 / 2));
			bullets.add(z);
		}
	}

	public void move() {
		if (dx != -1) {
			if (left + dx <= 150)
				left = left + dx;
			else {
				x = x + dx;
				nx2 = nx2 + dx;
				nx = nx + dx;
			}
		} else {
			if (left + dx > 0)
				left = left + dx;
		}
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Image getImage() {
		return Mortal_K1;
	}

	public int getdx() {
		return dx;
	}

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_LEFT) {
			dx = -1;
			Mortal_K1 = l.getImage();
		}

		if (key == KeyEvent.VK_RIGHT) {
			dx = 1;
			Mortal_K1 = i.getImage();
		}

		if (key == KeyEvent.VK_SPACE) {
			fire();
		}

		if (key == KeyEvent.VK_UP) {
			dy = 1;
			Mortal_K1 = j.getImage();
		}
	}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_LEFT)
			dx = 0;

		if (key == KeyEvent.VK_RIGHT)
			dx = 0;

		if (key == KeyEvent.VK_UP) {
			dy = 0;
			Mortal_K1 = i.getImage();
		}
	}
}
