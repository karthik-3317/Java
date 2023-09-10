package files;

import java.io.File;
import java.util.Scanner;

public class FileReadTrained {

	public static void main(String[] args) {
		try
		{
			File f=new File("G:\\files.txt");
			Scanner sc=new Scanner(f);
			while(sc.hasNext())
			{
			String data=sc.nextLine();
			System.out.println(data);
			}
			sc.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
