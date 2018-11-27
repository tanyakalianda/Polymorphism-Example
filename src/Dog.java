
public class Dog extends Animal
{
	//tries to call no argument constructor for Animal...doesn't exist
	
	public Dog(char gen)
	{
		super(gen);
	}
	
	public String speak()
	{
		return "woof";
	}
}
