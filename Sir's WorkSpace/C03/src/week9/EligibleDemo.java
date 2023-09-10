package week9;

public class EligibleDemo {
	public static void main(String[]args)
	{
		VoteEligible v=new VoteEligible();
		try {
			v.agechecker(22);
		}
		catch(EligibleVote e)
		{
			System.out.println(e);
		}
		
	}
}
