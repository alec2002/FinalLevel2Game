import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {
	Timer gameTimer;
	int x = 10;
	int y = 10;
	int width = 200;
	int height = 200;
	BufferedImage image = null;
	ImageObject image2;

	GamePanel() {
		gameTimer = new Timer(1000, this);

		try

		{
			image = ImageIO.read(this.getClass().getResourceAsStream("imgres.jpg"));
		} catch (

		Exception e)

		{
			System.err.println("There was an error loading your image.");
		}
		GameObject object = new GameObject(x, y, width, height);
		image2 = new ImageObject(x, y, width, height, image);

		gameTimer.start();
	}
	

	public void paintComponent(Graphics g) {
		g.fillRect(10, 10, 200, 200);
		image2.draw(g);
		System.out.println("Shuiwdyu");
	}

	public void actionPerformed(ActionEvent e) {
		this.repaint();
		//System.out.println("Shuiwdyu");

	}

}
