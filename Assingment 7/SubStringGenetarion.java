import java.util.*;

public class SubStringGenetarion {
	
	public static void subString(String str)
	{
		int i,j;
		
		for(i=0;i<str.length();i++)
		{
			for(j=i+1;j<=str.length();j++)
			{
				System.out.println(str.substring(i,j));
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		
		subString(str);
		

	}

}
