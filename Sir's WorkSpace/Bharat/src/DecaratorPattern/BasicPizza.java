package DecaratorPattern;

public class BasicPizza implements Pizza{


	@Override
	public String getDescription() {
		return "This is the basic pizza";
	}

	@Override
	public double getCost() {
		return 4.00;
	}
}
