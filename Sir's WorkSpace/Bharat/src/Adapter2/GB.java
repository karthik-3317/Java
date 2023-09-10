package Adapter2;

public class GB implements Girl{
	Boy b1;
	GB(Boy b1)
	{
		this.b1=b1;
	}
	public void smile() {
		b1.Laugh();
	}

	@Override
	public void eat() {
		b1.fastening();
	}

	@Override
	public void fight() {
		b1.War();
	}

}
