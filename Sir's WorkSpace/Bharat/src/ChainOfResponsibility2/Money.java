package ChainOfResponsibility2;

public class Money {
	public int HowMuch;
	Money(int HowMuch)
	{
		this.HowMuch=HowMuch;
	}
	public void setHowMuch(int ok)
	{
		HowMuch=ok;
	}
	public int getHowMuch()
	{
		return HowMuch;
	}
}
