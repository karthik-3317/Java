package Adapter2;

public class Girl1 implements Girl{

	@Override
	public void smile() {
		System.out.println("Her Smile is Very Charming");
	}

	@Override
	public void eat() {
		System.out.println("She Eats Very less amount of food");
	}

	@Override
	public void fight() {
		System.out.println("She Never fights At all ");
	}

}
