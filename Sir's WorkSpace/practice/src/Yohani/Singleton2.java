package Yohani;

public class Singleton2 {
	String name,add;
	int hn,noofcount;
	long  meterno,mobileno;
	private static Singleton2 single2;
	private Singleton2()
	{
		name="KARTHIK";
		add="NANDIVELUGU";
		hn=652;
		noofcount=4;
		meterno=1211655002;
		mobileno=798932709;
	}
	static Singleton2 getDetails()
	{
		if(single2==null)
		{
			return new Singleton2();
		}
		else
			return single2;
	}
	@Override
	public String toString() {
		return "Singleton2 [name=" + name + ", add=" + add + ", hn=" + hn + ", noofcount=" + noofcount + ", meterno="
				+ meterno + ", mobileno=" + mobileno + "]";
	}
}
