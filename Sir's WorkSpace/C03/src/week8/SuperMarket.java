package week8;
import java.util.LinkedList;
public class SuperMarket implements Comparable<SuperMarket>
{
	String name;
	int id,cost;
	SuperMarket(String name,int id,int cost)
	{
		this.name=name;
		this.id=id;
		this.cost=cost;
	}
	public int compareTo(SuperMarket o) {
	
		return cost-o.cost;
	}
	
	public String toString() {
		return "SuperMarket [name=" + name + ", id=" + id + ", cost=" + cost + "]";
	}
	
	
}
