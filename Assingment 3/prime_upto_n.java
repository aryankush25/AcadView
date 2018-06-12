import java.util.Scanner;

public class prime_upto_n {

	public static Boolean prime(int x)
	{
		Boolean flag = true;
		
		for(int i=2;i<=x/2;i++)
		{
			if(x % i == 0)
			{
				flag = false;
				break;
			}
		}
		
		return flag; 
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number ");
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for(int i=2;i<=n;i++)
		{
			if(prime(i)==true)
			{
				System.out.print(i+ " ");
			}
		}

	}

}
