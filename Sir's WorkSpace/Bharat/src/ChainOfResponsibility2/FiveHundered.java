package ChainOfResponsibility2;

public class FiveHundered implements Chain{
	private Chain nextInChain;
	public void setNextChain(Chain nextChain) {
		nextInChain=nextChain;
	}
	public void caluculate(Money request) {
		if(request.HowMuch!=0)
		{
			int all=request.HowMuch/500;
			System.out.println("The FiveHundered Notes required "+all);
			int allow=request.HowMuch-all*500;
			request.setHowMuch(allow);
		}
		if(request.HowMuch!=0)
		{
			nextInChain.caluculate(request);
		}
	}

}
