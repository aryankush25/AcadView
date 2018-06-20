import java.util.*;

public class DynamicArray {
	
	int size;
	int[] arr;
	int counter=0;
	
	DynamicArray()
	{
		/*System.out.println("Enter The Initial Size of Dynamic Array ");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();*/
		size=5;
		arr = new int[size];
	}
	
	// TO ADD ELEMENT IN ARRAY
	
	void add(int x)
	{
		if(counter<size)
		{
			arr[counter]=x;
		}
		else
		{
			resize();
			arr[counter]=x;
		}
		counter++;
	}
	
	// TO RETURN THE LAST VALUE
	
	int get(int x)
	{
		return arr[x];
	}
	
	// TO RESIZE ARRAY
	
	void resize()
	{
		int []arr1 = new int[counter];
		size=(int)(size*1.5);
		for(int i=0;i<counter;i++)
		{
			arr1[i]=arr[i];
		}
		
		arr = new int [size];
		
		for(int i=0;i<counter;i++)
		{
			arr[i]=arr1[i];
		}
	}
	
	// TO REMOVE VALUE FROM THE END
	
	void remove()
	{
		counter--;
	}
	
	// TO REMOVE VALUE AT PERTICULAR INDEX
	
	void removeAtIndex(int x)
	{
		for(int i=x;i<counter-1;i++)
		{
			arr[i]=arr[i+1];
		}
		counter--;
	}
	
	// TO SET VALUE AT PERTICULAR INDEX
	
	void setValueAt(int x,int y)
	{
		arr[x]=y;
	}
	
	// TO INSERT VALUE AT PERTICULAR INDEX
	
	void insertValueAt(int x,int y)
	{
		counter++;
		if(counter <= size)
		{
			for(int i=counter;i>x;i--)
			{
				arr[i]=arr[i-1];
			}
			arr[x]=y;
		}
		else
		{
			resize();
			for(int i=counter;i>x;i--)
			{
				arr[i]=arr[i-1];
			}
			arr[x]=y;
		}
	}
	
	// TO DISPLAY DYNAMIC ARRAY
	
	void display()
	{
		System.out.print("[");
		for(int i=0;i<counter-1;i++)
		{
			System.out.print(arr[i] + ",");
		}
		System.out.print(arr[counter-1] +"]");
	}
	
	// Get The Size
	
	int size()
	{
		return counter;
	}
	
	// Main Function
	
	public static void main(String[] args) {
		
		DynamicArray d = new DynamicArray();
		
		d.add(5);
		d.add(6);
		d.add(7);
		d.add(8);
		d.add(9);
		d.add(10);
		d.remove();
		d.removeAtIndex(2);
		d.insertValueAt(4,4);
		d.setValueAt(1,0);
		System.out.println("Value At 0 Index is " + d.get(0));
		System.out.println("Size of array is " + d.size());
		
		d.display();
		
	}

}
