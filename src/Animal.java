      
public abstract class Animal              //must make the class abstract as well b/c cannot instantiate
                                         //AN ABSTRACT CLASS CANNOT BE INSTANTIATED
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
