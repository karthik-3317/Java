package aditya;

public class Fact {
static int findFact()
{
	int temp=1,r,i,cat=0;
	while(StrongNumber.n>0)
	{
	r=StrongNumber.n%10;
	for(i=0;i<r;i++)
	{
	temp=temp*i;
	}
	cat=cat+temp;
	temp=1;
	}
	StrongNumber.n=StrongNumber.n/10;
	System.out.println(cat);
	return cat;
}
}
