import java.util.ArrayList;

public class Test
{

	public static void main(String[] args) 
	{
//		Dog dog = new Dog('f');
		Bird bird = new Bird('m');
		Animal notSure = new Bird('m');
		ArrayList<Animal> myAnimals = new ArrayList<Animal>();
		for (int i = 0; i < 1000; i ++)
		{
			int num = (int) (Math.random()*2);
			if (num==0)
				myAnimals.add(new Bird('f'));
			else
				myAnimals.add(new Dog('m'));
		}
		
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
		for (Animal animal: animals)            //can put birds + dogs in this array list b/c they are both animals (belong to animal class)
												//but this will only allow you to run the methods guaranteed for ALL animals -> methods in animal class
			                                    //w/o the abstract class, animal does not have a speak method -> error until you make abstract method OR type cast (Dog) and (Bird)
		{
			System.out.println(animal.speak());     //Polymorphism - goes as far down hierarchy as possible
													//to run a method - must have method in the super class
			                                        //if speak is removed from the animal class...error
			if(animal instanceof Dog)
			{
				System.out.println("dog");
				System.out.print(((Dog)animal).speak());   //guarantees it applies for a dog...don't need to type cast if you made Animal abstract
			}
			else
			{
				System.out.println("bird");
				System.out.print(((Bird)animal).speak());  //guarantees it applies for a bird...don't need if you made the class abstract
				                                          //BUT to run methods that ONLY apply to a bird -> need to type cast
			}
			
		}
		
	}

}
