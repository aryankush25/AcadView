import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;


public class InputOutputStream {
	
	public void transferContents() throws IOException{
		File in = new File("Assingment 9/abc.txt");
		File out = new File("Assingment 9/xyz.txt");
		out.createNewFile();
		FileInputStream inputStream = null;
		FileOutputStream outputStream = null;
		try {
			inputStream = new FileInputStream(in);
			outputStream = new FileOutputStream(out);
			int ch;
			System.out.print("Printing contents of abc.txt in console : ");
			while((ch = inputStream.read()) != -1) {
				outputStream.write(ch);
				System.out.print((char)(ch));
			}
			System.out.println();
			FileInputStream verify= new FileInputStream(out);
			System.out.print("Printing contents of xyz.txt in console for verification : ");
			while((ch = verify.read()) != -1) {
				System.out.print((char)(ch));
			}
			if(verify != null)
				verify.close();
		}
		catch(IOException e) {
			System.out.println("Error");
		}
		finally {
			if(inputStream != null) {
				inputStream.close();
			}
			if(outputStream != null) {
				outputStream.close();
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		InputOutputStream obj = new InputOutputStream();
		obj.transferContents();
	}

}