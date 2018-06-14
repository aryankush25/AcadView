package maximumOfTwoNumbersTakenAsString;

import java.util.*;

public class MaximumOfTwoNumbersTakenAsString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String num1,num2;
		
		num1 = sc.nextLine();
		num2 = sc.nextLine();
		
		int n1,n2;
		
		n1 = Integer.parseInt(num1);
		n2 = Integer.parseInt(num2);

		if(n1>n2)
			System.out.println(n1 + " is greater");
		else
			System.out.println(n2 + " is greater");
		
		sc.close();
		
	}

}
