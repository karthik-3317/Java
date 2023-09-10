package ChainOfResponsibility2;

import java.util.Scanner;

public class TestChain {

	public static void main(String[] args) {
		Chain chain1= new TwoThousand();
		Chain chain2=new FiveHundered();
		Chain chain3=new TwoHundered();
		Chain chain4=new OneHundered();
		
		chain1.setNextChain(chain2);
		chain2.setNextChain(chain3);
		chain3.setNextChain(chain4);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Money Please");
		Money request=new Money(sc.nextInt());
		chain1.caluculate(request);
	}

}
