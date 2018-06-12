import java.util.Scanner;

public class rectangle {

	float length;
	float breadth;
	float area;
	
	rectangle()
	{
		this.length = 0f;
		this.breadth = 0f;
	}
	
	public void getData(float length,float breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	void calculateArea()
	{
		this.area=this.length*this.breadth;
	}
	
	void displayArea()
	{
		System.out.println("The Area Is " + this.area);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float length,breadth;
		
		System.out.println("Enter Length ");
		length = sc.nextFloat();
		
		System.out.println("Enter Breadth ");
		breadth = sc.nextFloat();
		
		rectangle r = new rectangle();
		
		r.getData(length,breadth);
		r.calculateArea();
		r.displayArea();
		
		sc.close();
		
		

	}

}
