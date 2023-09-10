package generic;

public class Vvector implements Comparable<Vvector>{
	int id;
	String name ,address;
	int mark;
	float cgpa;
	Vvector(int id,String name,String address,int mark, float cgpa)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		this.mark=mark;
		this.cgpa=cgpa;
	}
	
	public String toString() {
		return "Vvector [id=" + id + ", name=" + name + ",address=" + address + ", mark=" + mark + ", cgpa=" + cgpa
				+ "]";
	}

	@Override
	public int compareTo(Vvector s) {
		
		//return id-s.id;
		//return name.compareTo(s.name);
		return address.compareTo(s.address);
	}
}
