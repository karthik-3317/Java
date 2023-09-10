package ChainOfResponsibility;

public class Numbers {
	private int number1;
	private int number2;
	private String caluculation;
	Numbers(int number1,int number2,String caluculation)
	{
		this.number1=number1;
		this.number2=number2;
		this.caluculation=caluculation;
	}
	public int getnumber1()
	{
		return number1;
	}
	public int getnumber2()
	{
		return number2;
	}
	public String getCaluculation()
	{
		return caluculation;
	}
	
}
