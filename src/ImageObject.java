import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class ImageObject extends GameObject {
	BufferedImage image;

ImageObject (int x, int y, int width, int height, BufferedImage image){
	super(x, y, width, height);
	this.image = image;

}
public void draw(Graphics g){
	g.drawImage(image, x, y, width, height, null);



}
}
