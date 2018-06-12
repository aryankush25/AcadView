//import java.util.Arrays;

public class sort_array {

	public static void ssort(int arr[])
	{
		int temp,i,j,min_index;
		
		for(i=0;i<arr.length-1;i++)
		{
			min_index=i;
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min_index])
					min_index=j;
			}
			
			temp=arr[i];
			arr[i]=arr[min_index];
			arr[min_index]=temp;
			
		}
		
	}
	
	public static void main(String[] args) {
		
		int [] arr = {1,1,1,1,0,0,1,0};
		
		ssort(arr);

		//Arrays.sort(arr);
		for(int t: arr)
		{
			System.out.println(t);
		}
		
	}

}
