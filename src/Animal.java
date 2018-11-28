      
public abstract class Animal              //must make the class abstract as well
{
	private char gender;
	
	public Animal (char gen)
	{
		gender = gen;
	}
	
//	public String speak()
//	{
//		return "speak";
//	}
	
	public abstract String speak();      //must override this method ONLY if you are extending the class
}
