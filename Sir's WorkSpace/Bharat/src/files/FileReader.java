package files;

import java.io.*;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) 
	{
		try
		{
			File f=new File("F:\\Aditya.txt");
			Scanner sc=new Scanner(f);
			while(sc.hasNextLine())
			{
				String data=sc.nextLine();
				System.out.println(data);
				sc.close();
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
