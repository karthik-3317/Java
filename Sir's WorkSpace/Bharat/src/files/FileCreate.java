package files;
import java.io.*;
public class FileCreate {
	public static void main(String[]args)
	{
		try
		{
			File f=new File("F:\\Aditya.txt");
			f.createNewFile();
		}
		catch(Exception e)
		{
			System.out.println("it is not possible");
		}
		
	}
}
