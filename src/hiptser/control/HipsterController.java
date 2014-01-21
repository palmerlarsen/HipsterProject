package hiptser.control;

import javax.swing.JOptionPane;
import hipster.model.Hipster;
import hipster.view.HipsterFrame;
/**
 * controller for the Hipster project
 * @author plar4927
 * 1.2 11/20/13 added methods to retrieval of hipsters.
 */
public class HipsterController
{
	private Hipster selfHipster;
	private Hipster [] classHipster;
	private HipsterFrame hFrame;
	private int hipsterCount;
	
    /**
     * creates a Hipster Controller to be used as part of the MVC paradigm.
     */
	public HipsterController()
	{
		selfHipster = new Hipster();
		classHipster = new Hipster [7];
		hipsterCount = 0;
	}
	/**
	 * replacing the current hipster.
	 * @return
	 */
	public Hipster getSelfHipster()
	{
		return selfHipster;
	}
	
	public Hipster [] getClassHipster()
	{
		return classHipster;
	}
/**
 * getter method for the hipster representing myself.
 * @param selfHipster
 */
	public void setSelfHipster(Hipster selfHipster)
	{
		this.selfHipster = selfHipster;
	}
    /**
      * used to start the application GUI for the hipster program;.
     */
	public void start()
	{
		hFrame = new HipsterFrame(this);
	}
	/**
	 * retrieves the hipster from the specified position in the array
	 * @param position
	 * @return
	 */
	public Hipster getSpecifiedHipster(int position)

	{
		Hipster currentHipster = null;
		
		if(position < classHipster.length && position >= 0)
		{
			currentHipster = classHipster[position];
		}
		
		return currentHipster;
	}
	/**
	 * used to retrieve a random HIpster object form the array of class hipster
	 * @return
	 */
	public Hipster getRandomHipster()
	{
		Hipster currentHipster = null;
		
		int randomIndex = 0;
		double random = Math.random();
		randomIndex = (int)(random*classHipster.length);
		currentHipster = classHipster[randomIndex];
		
		return currentHipster;
	}
	/**
	 * creates and adds a hipster to the array of class hipsters form the specified values.
	 * @param books array of books for current hipster.
	 * @param name name of the current hipster.
	 * @param type type for current hipster.
	 * @param phrase current hipsterness.
	 */
	public void addHipster(String [] books, String name, String type, String phrase)
	{
		if(hipsterCount < classHipster.length)
		{
			Hipster tempHipster = new Hipster(name, type, phrase, books);
			classHipster[hipsterCount] = tempHipster;
			hipsterCount++;
		}
		else
		{
			JOptionPane.showMessageDialog(hFrame, "You are to mainstream to become a hipster.");
		}
		
	}
}
