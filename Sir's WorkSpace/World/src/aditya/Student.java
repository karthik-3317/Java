package aditya;
public class Student {

	private String name,branch;
	private long id;
	private char gender;
	public boolean setName(String name)
	{
		int i;
		for(i=0;i<name.length();i++)
		{
			while(name.charAt(i)<'a' || name.charAt(i)>'z' )
				return false;
		}
		this.name=name;
		return true;
	}
	public String getName()
	{
		return name;
	}
	public boolean setId(long id)
	{
		int count=0;  long i;
		i=id;
		while(id>0)
		{
			id=id/10;
			count++;
		}
		if(count==10)
		{
		this.id=i;
			return true;
		}
		else
			return false;
	    }
	public long getId()
	{
		return id;
	}
	public char getGender()
	{
		return gender;
	}
	public boolean setGender(char gender)
	{
		if(gender=='m' || gender=='f')
		{
		this.gender=gender;
		return true;
		}
		else
			return false;
	}
	public boolean setBranch(String branch)
	{
		if(branch.equals("cse") || branch.equals("ece") || branch.equals("eee") || branch.equals("it"))
		{
		this.branch=branch;
		return true;
		}
		else
		{
			return false;
		}
	}
	public String getBranch()
	{
		return branch;
	}
}
