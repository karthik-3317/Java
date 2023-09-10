package guiProject;
public class Student {
	String name,add;
	int mark;
	float cgpa;
	Student(String name,String add,int mark,float cgpa)
	{
		this.name=name;
		this.add=add;
		this.mark=mark;
		this.cgpa=cgpa;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", add=" + add + ", mark=" + mark + ", cgpa=" + cgpa + "]";
	}
	
}
