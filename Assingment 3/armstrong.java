import java.util.Scanner;

public class armstrong {

	public static int armstrong(int n)
	{
		int count=0,temp,arm=0;
		
		temp=n;
		
		while(temp!=0)
		{
			count++;
			temp/=10;
		}
		
		//temp=n;
		
		while(n!=0)
		{
			temp = n%10; 
			arm = arm + power(temp,count);
			n/=10;
		}
		
		
		return arm;
	}
	
	public static int power (int x,int p)
	{
		int temp=x;
		for(int i=1;i<p;i++)
		{
			temp=temp*x;
		}
		return temp;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		if (n==armstrong(n))
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Number is not Armstrong");
		}
		
	}

}
