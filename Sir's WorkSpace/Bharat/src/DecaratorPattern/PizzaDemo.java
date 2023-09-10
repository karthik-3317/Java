package DecaratorPattern;

public class PizzaDemo {

	public static void main(String[] args) {
		Pizza pizza = new TomatoSauce(new BasicPizza());
		
		System.out.println(pizza.getDescription());
		System.out.println(pizza.getCost());
	}

}
