import java.util.Scanner;

public class n_even_numbers {

	public static void main(String[] args) {
		
		System.out.println("Enter The Number ");
		
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		
		for(int i=2;i<=num;i+=2)
		{
			System.out.println(i);
		}
		
	}

}
