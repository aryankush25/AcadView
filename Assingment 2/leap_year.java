import java.util.Scanner;

public class leap_year {
	public static void main(String [] args) {
		
		System.out.println("Enter the year ");
		
		Scanner s = new Scanner(System.in);
		
		int year = s.nextInt();
		
		boolean flag =false;
		
		if (year % 4 ==0)
		{
			if(year % 100 == 0)
			{
				if(year % 400 == 0)
				{
					flag=true;
				}
				else
				{
					flag = false;
				}
			}
			else
			{
				flag = true;
			}
		}
		else
		{
			flag = false;
		}
		
		if (flag)
		{
			System.out.println("It is a leap year" );
		}
		else
		{
			System.out.println("It is not a leap year" );
		}
		
	}
}
