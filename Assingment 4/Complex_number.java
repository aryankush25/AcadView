import java.util.Scanner;

public class Complex_number {

	int real;
	int imag;
	
	Complex_number()
	{
		this.real = 0;
		this.imag = 0;
	}
	
	void getData(int real,int imag)
	{
		this.real=real;
		this.imag=imag;
	}
	
	void display()
	{
		if(this.imag>=0)
			System.out.println("The Complex Number Is : " + this.real + "+" + this.imag + "i" );
		else
			System.out.println("The Complex Number Is : " + this.real +""+ this.imag + "i" );
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int real,imag;
		
		System.out.println("Enter Real Number ");
		real = sc.nextInt();
		
		System.out.println("Enter Imaginary Number ");
		imag = sc.nextInt();
		
		Complex_number c = new Complex_number();
		
		c.getData(real, imag);
		c.display();
		
		sc.close();
		
		

	}

}
