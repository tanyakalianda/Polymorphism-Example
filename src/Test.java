import java.util.ArrayList;

public class Test
{

	public static void main(String[] args) 
	{
//		ArrayList<Dog> myDogs = new ArrayList<Dog>();
//		myDogs.add(new Dog('m'));
//		myDogs.add(new Pitbull('f'));
//		for (Dog dog: myDogs)
//		{
//			System.out.println(dog.speak());     //Polymorphism
//		}
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog('m'));
		animals.add(new Bird('f'));
		animals.add(new Pitbull('f'));
		for (Animal animal: animals)
		{
			System.out.println(animal.speak());     //Polymorphism - goes as far down hierarchy as possible
													//to run a method - must have method in the super class
			                                        //if speak is removed from the animal class...error
			if(animal instanceof Dog)
			{
				System.out.println("dog");
			}
			else
			{
				System.out.println("bird");
			}
		}
		
	}

}
