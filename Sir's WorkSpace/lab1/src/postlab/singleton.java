package postlab;

public class singleton 
{
	   private static singleton instance = new singleton();

	   //make the constructor private so that this class cannot be instantiated
	   private singleton()
	   {}

	   //Get the only object available
	   public static singleton getInstance()
	{
	      return instance;
	   }

	   public void showMessage()
	{
	      System.out.println("Hello World!");
	   }
	

}
