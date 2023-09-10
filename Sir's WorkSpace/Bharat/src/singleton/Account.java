package singleton;

public class Account {
	private static Account s1;
	int balance;
	String name;
	int cvv;
	private Account()
	{
		balance=2000;
		name="Varsha(Bangaram)";
		cvv=236;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
	public int getBalance()
	{
		return balance;
	}
	public int getCvv()
	{
		return cvv;
	}
	public static Account getObject()
	{
		if(s1==null)
			return new Account();
		else
			return s1;
	}
	@Override
	public String toString() {
		return "Account [balance=" + balance + ", name=" + name + ", cvv=" + cvv + "]";
	}
}
