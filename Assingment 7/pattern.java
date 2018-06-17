
public class pattern {

	public static void main(String[] args) {
		char c =  'a';
		
		for(int i=0 ;i<3 ; i++)
		{
			c='a';
			for(int j=0;j<=i;j++)
			{
				System.out.print(c);
				c++;
			}
			System.out.println("");
		}

	}

}
