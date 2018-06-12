import java.util.Scanner;
public class add_2_numbers {

	public static void main(String[] args) {

		int num1,num2,sum=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The First Number : ");
		
		num1 = sc.nextInt();
		
		System.out.println("Enter The Second Number : ");
		
		num2 = sc.nextInt();
		
		sum= num1+num2;
		
		System.out.println("The sum is : " + sum);
		
		
	}

}
