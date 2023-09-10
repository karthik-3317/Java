package files;
import java.io.*;
public class FileDemo {

	public static void main(String[] args)  {
		try 
		{
			File fs = new File("F:\\ADITYAa.txt");
			if(fs.createNewFile())
			{
				System.out.println("file is created");
			}
			else
			{
				System.out.println("file already exists");
		}
		} 
		catch(Exception e1)
		{
			System.out.println("an error occured");
			e1.printStackTrace();
		}
	}
}
