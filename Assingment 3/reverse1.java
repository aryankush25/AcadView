import java.util.Scanner;

public class reverse1 {

	public static int rev(int num)
	{
		int rem,rev=0;
		while(num!=0)
		{
			rem = num % 10;
			rev = (rev*10) + rem;
			num = num / 10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter The Number ");
		
		int num = s.nextInt();
		
		System.out.println("Reverse is " + rev(num));
		
	}

}
