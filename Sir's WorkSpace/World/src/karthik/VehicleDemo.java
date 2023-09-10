package karthik;
public class VehicleDemo 
{
	public static void main(String args[])
	{
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle(8, "metallic magenta");
		System.out.println("No parameter constructor.");
		System.out.println("Vehicle:\nNo.of Wheels: "+v1.wheels+"\ncolour:"+v1.colour);
		System.out.println("Parametered constructor.");
		System.out.println("Vehicle:\nNo.of Wheels: "+v2.wheels+"\ncolour:"+v2.colour);
	}
}

