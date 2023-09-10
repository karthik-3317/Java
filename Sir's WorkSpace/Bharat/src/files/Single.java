package files;
public class Single {
	@Override
	public String toString() {
		return "Single [car=" + car + ", owner=" + owner + ", serial=" + serial + ", noseats=" + noseats + ", amount="
				+ amount + "]";
	}
	String car,owner;
	int serial,noseats;
	double amount;
	public static Single se;
	private Single(String f,String o,int s,int y,double a)
	{
		car=f;
		owner=o;
		serial=s;
		noseats=y;
		amount=a;
	}
	public static Single getObject()
	{
		if(se==null)
			return new Single("THAR","KARTHIK",25,4,200000);
		else
			return se;
	}
}
