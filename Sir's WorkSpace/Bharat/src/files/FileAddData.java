package files;

import java.io.*;

public class FileAddData {

	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("F:\\Aditya.txt");
			fw.write("my name is karthik");
			fw.close();
			System.out.println("file is writer");
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		

	}

}
