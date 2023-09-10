package generic;

public class LinkedDemo implements Comparable<LinkedDemo> 
{
	String name,address;
	int id,marks;
	double cgpa;
	LinkedDemo(String na,String add, int id, double cgpa,int marks)
	{
		this.name=na;
		this.address=add;
		this.id=id;
		this.cgpa=cgpa;
		this.marks=marks;
	}
	

	@Override
	public int compareTo(LinkedDemo upi) {
		return this.id-upi.id;
	}


	@Override
	public String toString() {
		return "LinkedDemo [name=" + name + ", address=" + address + ", id=" + id + ", marks=" + marks + ", cgpa="
				+ cgpa + "]";
	}
}
