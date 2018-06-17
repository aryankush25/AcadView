import java.util.*;

public class StringReverse {

	static String reverse( String str )
	{
		String rev = "";
		
		for(int i = str.length()-1 ; i>=0 ; i-- )
		{
			rev = rev + str.charAt(i);
		}
		
		return rev;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println("The Reverse is " + reverse(str));
		
		sc.close();
	}

}
