package ChainOfResponsibility2;

public interface Chain {
	void setNextChain(Chain nextChain);
	void caluculate(Money request);
}
