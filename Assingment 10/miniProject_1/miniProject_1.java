package miniProject_1;

import java.util.*;
import java.io.*;


public class miniProject_1 {
	
	

	public static void main(String[] args) {
		
		try {
			
			// Part 1 - Create abc.txt with 2 paths.
			
			Scanner s = new Scanner(System.in);
			System.out.println("Enter Path of csv file ( Eg - /Users/aryankush25/Desktop/AcadView/Assingment 10/miniProject_1/abc.csv)");
			String path1 = s.nextLine();
			System.out.println("Enter Path of file where you want to print path of both files ( Eg - /Users/aryankush25/Desktop/AcadView/Assingment 10/miniProject_1/abc.txt)");
			String path2 = s.nextLine();
			
			File f1= new File(path2);
			f1.createNewFile();
			FileWriter fw1 = new FileWriter(f1);
			fw1.write(path1 + "\n" + path2);
			fw1.close();
			
			// Part 2 - Recursively traverse all the files and folders to enlist all files with names and paths.
			
			ArrayList <File> list = new ArrayList<File> ();
			
			System.out.println("Enter Path of Folder Of Which You Want To Enlist The Files ( Eg - /Users/aryankush25/Desktop/AcadView)");
			String path3 = s.nextLine();
			
			functionEnlistFiles(list,path3);
			
			// Part 3 - Create an ArrayList of file paths.
			
			ArrayList <String> list1 = new ArrayList<String> ();
			
			functionEnlistFilePaths(list,list1);
			
			
			// Part 4 - Create a csv file of the file names and file paths.
			
			
			File f2 = new File(path1);
			f2.createNewFile();
			
			FileWriter fw = new FileWriter(f2);
			
			for(File f : list)
			{
				fw.write(f.getName() + " , " + f.getAbsolutePath() + "\n");
			}
			
			fw.close();
			
			
			s.close();
		}
		catch (Exception e) {
			System.out.println("Exception : " + e);
		}
		finally {
			System.out.println("Task Completed");
		}
		

	}


	private static void functionEnlistFilePaths(ArrayList<File> list, ArrayList<String> list1) {
		
		for(File f : list)
		{
			list1.add(f.getAbsolutePath());
		}
		
	}


	private static void functionEnlistFiles(ArrayList<File> list, String path3) {
		
		File f = new File(path3);
		File [] arr = f.listFiles();
		
		for(File ff : arr)
		{
			if(ff.isDirectory())
			{
				functionEnlistFiles(list,ff.getAbsolutePath());
			}
			else
			{
				list.add(ff);
			}
		}
	}

}
