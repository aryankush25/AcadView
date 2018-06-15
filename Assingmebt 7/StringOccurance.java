import java.util.*;

public class StringOccurance {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String str1,str2;
		
		str1 = s.nextLine();
		str2 = s.nextLine();
		
		if(str1.contains(str2))
		{
			System.out.println("It Contains The String");
		}
		else
		{
			System.out.println("It do not Contains The String");
		}

	}

}
