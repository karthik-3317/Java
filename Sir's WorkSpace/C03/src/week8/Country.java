package week8;

public class Country implements Comparable<Country>{
	String name;
	Country(String name)
	{
		this.name=name;
	}
	
	public String toString() {
		return "Country [name=" + name + "]";
	}
	public int compareTo(Country o) {
		
		return name.compareTo(o.name);
		
	}

}
