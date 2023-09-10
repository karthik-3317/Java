package generic;

public class AoopGeneric<T1> {
	int adi;
	int kcp;
	int tdp;
	AoopGeneric(int adi,int kcp,int tdp)
	{
		this.adi=adi;
		this.kcp=kcp;
		this.tdp=tdp;
	}
	public int getadi()
	{
		return adi;
	}
	public int getkcp()
	{
		return kcp;
	}
	public int gettdp()
	{
		return tdp;
	}
	public void setadi(int adi)
	{
		 this.adi=adi;
	}
	public void setkcp(int kcp)
	{
		this.kcp=kcp;
	}
	public void settdp(int tdp)
	{
		this.tdp=tdp;
	}

}
