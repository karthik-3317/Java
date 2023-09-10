package Arraylist;

//import java.util.Comparable;

public class Array implements Comparable<Array>{
	public int one;
	public int second;
	public int three;
	public Array(int one,int second,int three)
	{
		this.one=one;
		this.second=second;
		this.three=three;
	}
	@Override
	public String toString() {
		return "Array [one=" + one + ", second=" + second + ", three=" + three + "]";
	}
	@Override
	public int compareTo(Array o) {
		return o.one-o.one;
	}
}
