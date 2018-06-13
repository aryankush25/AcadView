class Animal {
	String breed;
	String color;
	
	void speak()
	{
		breed = "xyz";
		color = "Black";
		System.out.println("Animal Speeks");
		System.out.println("The Color is " + color);
		System.out.println("The Breed is " + breed);
	}
	
}

class Dog extends Animal {
	
	void speak()
	{
		breed = "abc";
		color = "Brown";
		System.out.println("Dog Speeks");
		System.out.println("The Color is " + color);
		System.out.println("The Breed is " + breed);
		
	}
}

class Cat extends Animal {
	
	void speak()
	{
		breed = "mno";
		color = "White";
		System.out.println("Cat Speeks");
		System.out.println("The Color is " + color);
		System.out.println("The Breed is " + breed);
	}
	
}

public class Override_animal {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.speak();
		
		Dog dog = new Dog();
		dog.speak();
		
		Cat cat = new Cat();
		cat.speak();
		
	}

}
