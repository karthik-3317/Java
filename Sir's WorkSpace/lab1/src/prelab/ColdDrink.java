package prelab;

public abstract class ColdDrink implements Item {

	public Packing packing() {
       return new Bottle();
	}

	public abstract float price();

	public String name() {
		// TODO Auto-generated method stub
		return null;
	}
}
