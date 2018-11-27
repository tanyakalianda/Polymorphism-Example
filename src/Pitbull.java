
public class Pitbull extends Dog
{
	public Pitbull(char gen)
	{
		super(gen);    //calls the dog's constructor -> calls the animal's constructor
	}
	
	public String speak()
	{
		return "WOOF";
	}
}
