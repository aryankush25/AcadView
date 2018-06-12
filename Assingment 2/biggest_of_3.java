import java.util.Scanner;

public class biggest_of_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("Enter 3 Numbers ");
		
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		
		if(a>c && a>b)
		{
			System.out.println(a+" is biggest");
		}
		else
		{
			if(b>a && b>c)
			{
				System.out.println(b+" is biggest");
			}
			else
			{
				System.out.println(c+" is biggest");
			}
		}
		
	}

}
