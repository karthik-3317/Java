package week9;

public class VoteEligible {
	int age;
	void agechecker(int age) throws EligibleVote
	{
	if(age>18)
	{ 
		this.age=age;
		System.out.println("you are eligible for vote");
	}
	else
		throw new EligibleVote("you are not eligible for vote");
	}
}
