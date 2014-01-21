package hipster.model;
/**
 * creates Hipster objects
 * @author plar4927
 *@version 1.2 11/20/13
 */
public class Hipster
{
	private String name;
	private String hipsterType;
	private String hipsterPhrase;	
	private String [] hipsterBooks;
	
	/**
	 * creates variables in the constructor
	 */
	public Hipster()
	{
		hipsterBooks = new String[5];
		name = "Palmer";
		hipsterType = "Student Hipster";
		hipsterPhrase = "Baller";
		
		fillTheBooks();
	}
	
	/**
	 * names all of the variables created in the constructor
	 * @param name
	 * @param hipsterType
	 * @param hipsterPhrase
	 * @param hipsterBooks
	 */
	public Hipster(String name, String hipsterType, String hipsterPhrase, String [] hipsterBooks)
	{
		this.name = name;
		this.hipsterBooks = hipsterBooks;
		this.hipsterPhrase = hipsterPhrase;
		this.hipsterType = hipsterType;
	}

	/**
	 * getters and setters for names, hipster type, hipster phrase and hipster books.
	 * @return
	 */
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getHipsterType()
	{
		return hipsterType;
	}

	public void setHipsterType(String hipsterType)
	{
		this.hipsterType = hipsterType;
	}

	public String getHipsterPhrase()
	{
		return hipsterPhrase;
	}

	public void setHipsterPhrase(String hipsterPhrase)
	{
		this.hipsterPhrase = hipsterPhrase;
	}

	public String[] getHipsterBooks()
	{
		return hipsterBooks;
	}

	public void setHipsterBooks(String[] hipsterBooks)
	{
		this.hipsterBooks = hipsterBooks;
	}
	
	private void fillTheBooks()
	{
		hipsterBooks[0] = "Oxford Distionary";
		hipsterBooks[1] = "V for Vendetta";
		hipsterBooks[2] = "Harry Potter";
		hipsterBooks[3] = "Ender's Game";
		hipsterBooks[4] = "The Godfather";
	}
	
}
