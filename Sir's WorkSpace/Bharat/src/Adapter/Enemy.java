package Adapter;
import java.util.Random;
public class Enemy implements EnemyAttacker{
	Random ran=new Random();
	@Override
	public void dodamage() {
		System.out.println("The damage done by Attacker" +ran.nextInt(10)+1);
	}

	@Override
	public void moveforward() {
		System.out.println("The Attacker moves "+ran.nextInt(10)+1);
	}

	@Override
	public void drivername(String name) {
		System.out.println("The name of driver "+name);
	}
	
	
}
