package files;

import java.io.File;

public class FileExist {
	public static void main(String[] args)
{
		try{
	File fs=new File("F:\\Aditya.txt");
	if(fs.exists())
	{
		System.out.println("file is their");
		System.out.println(fs.getName());//prints the file name
		System.out.println(fs.getAbsolutePath());//prints the absolute storage path in the pc
		System.out.println(fs.length());//prints the number  characters in the file
		System.out.println(fs.canRead());//if we can read anything from the file or not return boolean
		System.out.println(fs.canExecute());//if we can execute the file or not returns boolean
	}
	else
	{
		System.out.println("file is not their");
	}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
}
}
