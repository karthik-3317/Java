package Adapter;

public class RobotAdapter implements EnemyAttacker{
	
	Robot robo;
	RobotAdapter(Robot robo)
	{
		this.robo=robo;
	}
	
	@Override
	public void dodamage() {
		
		robo.smashWithHands();
	}

	@Override
	public void moveforward() {
		robo.walkForward();
		
	}

	@Override
	public void drivername(String name) {
		robo.robotName(name);
		
	}

}
