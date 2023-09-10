package ChainOfResponsibility;

public interface Chain {
	void setNextChain(Chain nextChain);
	void caluculate(Numbers request);
}
