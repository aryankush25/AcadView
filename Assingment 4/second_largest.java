import java.util.Scanner;

public class second_largest {

	public static int largest(int [] arr)
	{
		int i,largest,index=0;
		
		largest=arr[0];
		
		for(i=1;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
				index=i;
			}
		}
		
		return index;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[10];
		
		System.out.println("Enter 10 values ");
		
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int large;
		
		large = largest(arr);
		
		arr[large]=-999999999;
		
		large = largest(arr);
		
		System.out.println("The Second Largest Number Is " + arr[large]);
		
		
		sc.close();
	}

}
