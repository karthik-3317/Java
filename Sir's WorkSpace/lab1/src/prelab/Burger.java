package prelab;

public abstract class Burger implements Item
{
	 public Packing packing() {
	      return new Wrapper();
	   }

	   public abstract float price();

	public String name() {
		// TODO Auto-generated method stub
		return null;
	}
}
