package week9;

public class BigoneDemo {

	public static void main(String[] args) {
		Bigone on=new Bigone();
		try
		{
			on.nameChecker("aditya");
		}
		catch(Bigonename e)
		{
			System.out.println(e);
		}
		try
		{
			on.urlChecker(25);
		}
		catch(BigoneUrl e)
		{
			System.out.println(e);
		}
		try
		{
			on.ip(85);
		}
		catch(BigoneIp e)
		{
			System.out.println(e);
		}
		try
		{
			on.imei(5412145);
		}
		catch(BigoneImei e)
		{
			System.out.println(e);
		}
	}

}
