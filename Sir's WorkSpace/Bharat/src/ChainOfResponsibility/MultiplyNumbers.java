package ChainOfResponsibility;

public class MultiplyNumbers implements Chain{
	private Chain nextInChain;
	@Override
	public void setNextChain(Chain nextChain) {
		
		nextInChain=nextChain;
	}

	@Override
	public void caluculate(Numbers request) {
		int num1=request.getnumber1();
		int num2=request.getnumber2();
		if(request.getCaluculation()=="mul")
		{
			System.out.println("The Multiplication of two Numbers "+num1*num2);
		}
		else
		{
			nextInChain.caluculate(request);
		}
	}

}
