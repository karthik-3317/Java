package Yohani;
public class Singleton3Demo {
	public static void main(String[] args)
	{
		Singleton3 upi=Singleton3.getDetails();
		Singleton3 atm=Singleton3.getDetails();
		Singleton3 bank=Singleton3.getDetails();
		String u=Singleton3.getDetail();
		System.out.println(u);
		System.out.println(upi);
		System.out.println(atm);
		System.out.println(bank);
	}

}
