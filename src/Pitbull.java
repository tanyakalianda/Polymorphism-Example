//instantiate the class(s) at the VERY bottom of the hierarchy
//Super classes are SOLELY there to be a super class

public class Pitbull extends Dog
{
	public Pitbull(char gen)    //needs a constructor b/c there is no default constructor with no arguments in the super class (dog)
	{
		super(gen);    //calls the dog's constructor -> calls the animal's constructor
	}
	
	public String speak()
	{
		return "WOOF";
	}
}
