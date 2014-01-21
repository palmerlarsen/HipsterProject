package hipster.view;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 * create variables for picture panel
 * @author plar4927
 *
 */
public class PicturePanel extends JPanel
{
private Image baseImage;
private ImageIcon pictureSource;
private int width;
private int height;


/**
 * creates a picture panel object with the specified URL path, width, and height.
 * @param imagePath
 * @param width
 * @param height
 */
public PicturePanel(URL imagePath,int width, int height)
{
	this.width = width;
	this.height = height;
	this.pictureSource = new ImageIcon(imagePath);
}

//overrides the paintcomponent method of JPanel to draw the image to fill the entire panel.
protected void paintComponent(Graphics panelGraphics)
{
	super.paintComponent(panelGraphics);
	baseImage = pictureSource.getImage();
	panelGraphics.drawImage(baseImage, 0, 0, width, height, null);
}

}
