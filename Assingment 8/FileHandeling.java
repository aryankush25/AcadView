import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;


public class FileHandeling {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\AcadView\\assignment.txt");
		file.createNewFile();
		file.mkdirs();
		FileReader input = null;
		
	    try {
	    	
	    	input = new FileReader(file);
	    	int ch=input.read();

	    	while(ch != -1) {
			   System.out.print((char)ch);
			   ch = input.read();
		   }
	    	System.out.println();
	    } 
	    catch(InputMismatchException e) {
	    	 System.out.println("Input is invalid");
	    } finally {
	 	   if (input != null)
	 	   {
	 		  input.close();
	 		  System.out.println("File Closed Successfully");
	 	   }
	    }
	    }
	}