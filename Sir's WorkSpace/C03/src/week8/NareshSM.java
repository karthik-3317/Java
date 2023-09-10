package week8;

public class NareshSM implements Comparable<NareshSM>
{
	String movie;
	NareshSM(String movie)
	{
		this.movie=movie;
	}
	public int compareTo(NareshSM o) 
	{
	
		return movie.compareTo(o.movie);
	}
	public String toString() {
		return "NareshSM [movie=" + movie + "]";
	}
	
	
}
