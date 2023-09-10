package StatePattern;

public class Context {
	private State state;
	public Context()
	{
		state=null;
	}
	public void setState(State obj)
	{
		state=obj;
	}
	public State getState()
	{
		return state;
	}
}
