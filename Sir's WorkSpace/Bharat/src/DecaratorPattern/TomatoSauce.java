package DecaratorPattern;

public class TomatoSauce extends ToppingDecarator{

	TomatoSauce(Pizza newPizza) {
		super(newPizza);
		
		System.out.println("Adding Dough");
		System.out.println("Adding TomatoSauc");
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
