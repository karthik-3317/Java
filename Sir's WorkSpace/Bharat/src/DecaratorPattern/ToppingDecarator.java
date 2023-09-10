package DecaratorPattern;

public abstract class ToppingDecarator implements Pizza{
	
	protected Pizza temppizza;
	
	ToppingDecarator(Pizza newPizza)
	{
		temppizza=newPizza;
	}
	
	public String getDescription()
	{
		return temppizza.getDescription();
	}
	
	public double getCost()
	{
		return temppizza.getCost();
	}

}
