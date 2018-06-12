import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		
		System.out.println("Enter The Number" );
		
		Scanner s = new Scanner(System.in);
		
		int i,n = s.nextInt();
		boolean flag = false;
		
		for(i=2;i<=n/2;i++)
		{
			if(n % i == 0)
			{
				flag = true;
			}
		}
		
		if(flag || n==1)
		{
			System.out.println("It is not a Prime Number ");
		}
		else
		{
			System.out.println("It is a Prime Number ");
		}
		

	}

}
