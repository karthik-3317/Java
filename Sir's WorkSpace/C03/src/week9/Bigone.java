package week9;
public class Bigone {
	String name;
	int url;
	double ip;
	double imei;
	void nameChecker(String name) throws Bigonename
	{
		if(name.matches("[a-zA-Z]+"))
		{
			this.name=name;
		}
		else 
			throw new Bigonename("this is not matching to our name");
	}
	void urlChecker(int url) throws BigoneUrl
	{
		if(url>0)
		{
			this.url=url;
		}
		else
			throw new BigoneUrl("this is not a url in our language");
	}
	void ip(double ip) throws BigoneIp
	{
		if(ip>0)
		{
			this.ip=ip;
		}
		else
		{
			throw new BigoneIp("this is not a ip address");
		}
	}
	void imei(double imei) throws BigoneImei
	{
		if(imei>=0)
			this.imei=imei;
		else
			throw new BigoneImei("your imei is not correct");
	}
}
