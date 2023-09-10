package files;
import java.io.FileWriter;
public class FileWrite 
{	
	public static void main(String[] args) {
		try
		{
			FileWriter fsw=new FileWriter("F:\\karthik.txt");
			fsw.write("we are living in a small town called nandivelugu");
			fsw.close();
			System.out.println("succesfully written in the file name karthik");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
