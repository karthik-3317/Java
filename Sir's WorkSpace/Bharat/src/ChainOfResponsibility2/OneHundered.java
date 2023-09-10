package ChainOfResponsibility2;

public class OneHundered implements Chain{
	private Chain nextInChain;
	public void setNextChain(Chain nextChain) {
		nextInChain=nextChain;
	}
	@Override
	public void caluculate(Money request) {
		if(request.HowMuch!=0)
		{
			int all=request.HowMuch/100;
			System.out.println("The OneHundered Notes Required "+all);
			int allow=request.HowMuch-all*100;
			request.setHowMuch(allow);
		}
		if(request.HowMuch!=0)
		{
			System.out.println("Some Rupees Are Detected With Above Notes");
		}
		
	}

}
