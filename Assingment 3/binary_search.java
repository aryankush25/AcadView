import java.util.Arrays;
import java.util.Scanner;

public class binary_search {

public static void main(String[] args) {
		
		int [] arr = {1,4,6,7,8,9,10};
		
		System.out.println("Enter Number To Search ");
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		System.out.print(n+ " Found at index " + Arrays.binarySearch(arr, n));
		

		s.close();
		
		/*for(int t: arr)
		{
			System.out.println(t);
		}*/
		
	}

}
