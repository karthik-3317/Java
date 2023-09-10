package ChainOfResponsibility2;

public class TwoHundered implements Chain{
	private Chain nextInChain;
	public void setNextChain(Chain nextChain) {
		nextInChain=nextChain;
		
	}
	@Override
	public void caluculate(Money request) {
		if(request.HowMuch!=0)
		{
			int all=request.HowMuch/200;
			System.out.println("The TwoHundered Notes Required "+all);
			int allow=request.HowMuch-all*200;
			request.setHowMuch(allow);
		}
		if(request.HowMuch!=0)
		{
			nextInChain.caluculate(request);
		}
		
	}

}
