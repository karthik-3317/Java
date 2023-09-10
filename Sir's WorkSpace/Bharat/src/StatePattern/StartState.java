package StatePattern;

public class StartState implements State{

	public void presentState(Context obj) 
	{
		obj.setState(this);
		System.out.println("Player is in Start State");
	}

}
