package question_2;

public class Dog extends Animal {
	
	Dog()
	{
		color = "Black";
		breed = "xyz";
		name = "Tommy";
	}
	
	void eat()
	{
		System.out.println("The Dog of color , breed and name - " + color + " , " + breed + " , " + name + " Eats" );
	}
	void speaks()
	{
		System.out.println("The Dog of color , breed and name - " + color + " , " + breed + " , " + name + " Speaks" );
	}
	
}
