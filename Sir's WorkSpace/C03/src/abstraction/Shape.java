package abstraction;

public abstract class Shape {
	public double l,b,h;
	abstract double findVolume();
	@Override
	public String toString() {
		return "Shape [l=" + l + ", b=" + b + ", h=" + h + "]";
	}
	
}
