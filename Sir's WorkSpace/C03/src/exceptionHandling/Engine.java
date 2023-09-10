package exceptionHandling;

public class Engine {
	int engId,horsePow;
	String engType;
	double EngineWei;
	public void setId(int id) throws ExceptionHandleId
	{
		int u;
		u=id;
		int count=0;
		while(id>0)
		{
			count++;
			id/=10;
		}
		if(count==5)
		this.engId=u;
		else 
			throw new ExceptionHandleId("Something went wrong");
	}
	public void setengineType(String name) throws ExceptionHandleName
	{
		 if((name.matches("[a-zA-Z]+")) && name.length()==8)
		 {
			   this.engType=name;
		 }
		   else
			   throw new ExceptionHandleName("Name contains digit or special symbol");
	}
	public void setengineHorse(int horse) throws ExceptionHandleHorsePower
	{ 
		if(horse<2000)
			this.horsePow=horse;
		else 
			throw new ExceptionHandleHorsePower("Horse power is not matching");
	}
	public void setengineWeight(double wei ) throws ExceptionHandleWeight
	{
		if(wei<500)
		{
			this.EngineWei=wei;
		}
		else 
			throw new ExceptionHandleWeight("Everything looks bad");
	}
	public String toString() {
		return "Engine [engId=" + engId + ", horsePow=" + horsePow + ", engType=" + engType + ", EngineWei=" + EngineWei
				+ "]";
	}
}
