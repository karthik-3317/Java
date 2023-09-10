package ChainOfResponsibility2;

public class TwoThousand implements Chain{
	private Chain nextInChain;
	public void setNextChain(Chain nextChain) {
		nextInChain=nextChain;
	}
	public void caluculate(Money request) {
		if(request.HowMuch!=0)
		{
			int all=request.HowMuch/2000;
			System.out.println("The Two Thousand Notes requried "+request.HowMuch/2000);
			int allow=request.HowMuch-2000*all;
		    request.setHowMuch(allow);	
		}
		if(request.HowMuch!=0)
		{
			nextInChain.caluculate(request);
		}
		
	}
	

}
