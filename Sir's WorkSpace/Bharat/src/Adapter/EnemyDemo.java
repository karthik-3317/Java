package Adapter;

public class EnemyDemo {

	public static void main(String[] args) {
		Enemy enemy =new Enemy();
		Robot robo=new Robot();
		EnemyAttacker roboAdapter =new RobotAdapter(robo);
		
		System.out.println("The Enemy");
		enemy.dodamage();
		enemy.drivername("karthik");
		enemy.moveforward();
		
		System.out.println("The Robot");
		robo.smashWithHands();
		robo.walkForward();
		robo.robotName("Chitti");
		
		System.out.println("Now we are printing the adapter pattern way of assingment");
		roboAdapter.dodamage();
		roboAdapter.drivername("Aditya");
		roboAdapter.moveforward();
	}

}
