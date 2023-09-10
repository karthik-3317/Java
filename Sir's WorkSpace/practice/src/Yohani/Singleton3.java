package Yohani;
public class Singleton3 {
	String Accname;
	long Accno,mobile;
	char gender;
	double balance;
	private static Singleton3 single3;
	private Singleton3()
	{
	  Accname="Neelima ganga kumari";
	  Accno=12113040;
	  mobile=798932709;
	  gender='f';
	  balance=28687.67;
	}
	static Singleton3 getDetails()
	{
		if(single3==null)
		{
			return new Singleton3();
		}
		else
			return single3;
	}
	static String getDetail()
	{
		return "welcome";
	}
	@Override
	public String toString() {
		return "Singleton3 [Accname=" + Accname + ", Accno=" + Accno + ", mobile=" + mobile + ", gender=" + gender
				+ ", balance=" + balance + "]";
	}
	
}
