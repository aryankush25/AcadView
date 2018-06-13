class Overload {
	void print ()
	{
		System.out.println("Null Argument Function Called");
	}
	
	void print (int x)
	{
		System.out.println("Int Argument Function Called value is " + x);
	}
	
	void print (float y)
	{
		System.out.println("Float Argument Function Called value is " + y);
	}
}

public class OverloadFuntion {

	public static void main(String[] args) {
		
		Overload o = new Overload();
		
		o.print();
		o.print(5);
		o.print(25.56f);

	}

}
