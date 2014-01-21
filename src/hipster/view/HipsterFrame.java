package hipster.view;

import hiptser.control.HipsterController;

import javax.swing.JFrame;
/**
 * creates JFrame for the project
 * @author plar4927
 *version 1.1 11/20/13S
 */
public class HipsterFrame extends JFrame
{
	/**
	 * creating variable to be used within HipsterFrame
	 */
	private HipsterController baseController;
	private HipsterPanel basePanel;
	
	/**
	 * Initialize all variable within the constructor
	 * @param baseController
	 */
	public HipsterFrame(HipsterController baseController)
	{
		this.baseController = baseController;
		basePanel = new HipsterPanel(baseController);
		
		setupFrame();
	}
	 /**
	  * set up size and layout of Frame
	  */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(525,450);
		this.setVisible(true);
	}
}
