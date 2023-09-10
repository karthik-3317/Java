package files;

import java.io.File;

public class FileCreateTrained {

	public static void main(String[] args) 
	{
		try {
		File f=new File("F:\\karthik.txt");
		if(f.createNewFile())
		{
			System.out.println("file is created in f drive");
		}
		else
			System.out.println("file is not created in f drive or created somewhere other location");
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
