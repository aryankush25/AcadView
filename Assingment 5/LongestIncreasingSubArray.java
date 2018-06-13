import java.util.Scanner;

public class LongestIncreasingSubArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of Array");
		int x=0,index=0,counter=0,count=0,n = sc.nextInt();
		
		int [] arr = new int[n];
		
		System.out.println("Enter Elements Of Array");
		
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		
		
		for(int i=1 ;i<n;i++)
		{
			if(arr[i-1]<arr[i])
			{
				count++;
				//System.out.println(arr[i]);
			}
			else
			{
				if(counter<count)
				{
					counter=count;
					index=i;
				}
				count=0;
			}
		}
		counter+=1;
		
		int [] arr1 = new int[counter];
		
		for(int i=index-counter ;i<index;i++)
		{
			arr1[x]=arr[i];
			x++;
		}
		
		
		
		//System.out.println("index Of SubArray is " + index);
		System.out.println("Size Of SubArray is " + counter);
		
		System.out.println("SubArray is ");
		for(int i=0;i<counter;i++)
		{
			System.out.print(arr1[i] + " ");
		}
			
		
		sc.close();
		
	}

}
