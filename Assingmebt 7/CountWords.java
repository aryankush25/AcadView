import java.util.Scanner;

public class CountWords {

	String str;
	CountWords()
	{
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		sc.close();
	}
	
	void count()
	{
		int count = 0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println("The Words Count is " + count);
	}
	
	public static void main(String[] args) {
		
		CountWords c = new CountWords();
		
		c.count();
		
	}

}
