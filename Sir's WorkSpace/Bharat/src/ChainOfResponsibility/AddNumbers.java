package ChainOfResponsibility;

public class AddNumbers implements Chain{
	private Chain nextInChain;
	@Override
	public void setNextChain(Chain nextChain) {
		nextInChain=nextChain;
	}

	@Override
	public void caluculate(Numbers request) {
		if(request.getCaluculation()=="add")
		{
			int num1=request.getnumber1();
			int num2=request.getnumber2();
			System.out.println("The Addition of Two Numbers "+num1+num2);
		}
		else
		{
			nextInChain.caluculate(request);
		}
	}

}
