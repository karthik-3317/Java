package aditya;

public class Factt {
static int findFact()
{
	int temp=1,r,i,caat=0;
	System.out.println(StrongNumber.n);
	while(StrongNumber.n>0)
	{
	r=StrongNumber.n%10;
	for(i=1;i<=r;i++)
	{
	temp=temp*i;
	}
	System.out.println(temp);
	caat=caat+temp;
	temp=1;
	StrongNumber.n=StrongNumber.n/10;
	}
	System.out.println(caat);
	return caat;
}
}
