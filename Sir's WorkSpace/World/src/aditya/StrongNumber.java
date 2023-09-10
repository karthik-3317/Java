package aditya;

public class StrongNumber {
	static int n;
	static boolean isStrong()
	{
		int run;
		run=n;
		if(run==Factt.findFact())
			return true;
		else 
			return false;
	}
	
}
