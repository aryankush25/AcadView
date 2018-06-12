import java.util.Scanner;
import java.util.Arrays;

public class waveform {

	public static void swap_adjascent(int [] arr)
	{
		int temp;
		for(int i=0;i<arr.length;i+=2)
		{
			temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
	}
	
	public static void display(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[10];
		
		System.out.println("Enter 10 values ");
		
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		swap_adjascent(arr);
		display(arr);
		
		
		sc.close();
	}

}
