package ChainOfResponsibility;

public class DivideNumbers implements Chain{
	private Chain nextInChain;
	@Override
	public void setNextChain(Chain nextChain) {
	     nextInChain=nextChain;
	}

	@Override
	public void caluculate(Numbers request) {
		int num1=request.getnumber1();
		int num2=request.getnumber2();
		if(request.getCaluculation()=="div")
		{
			System.out.println("The Divison of Two Numbers "+num1/num2);
		}
		else
		{
			System.out.println("We Can Do Operations Only For add,sub,mul,div");
		}
	}
	
}
