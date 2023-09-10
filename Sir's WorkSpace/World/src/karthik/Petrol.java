package karthik;
public class Petrol {
	String location,petrol;
	int quantity;
	double price,discount;
	void setlocation(String location)
	{
		this.location=location;
	}
	void setpetrol(String petrol)
	{
		this.petrol=petrol;
	}
	void setquantity(int quantity)
	{
		this.quantity=quantity;
	}
	void setprice(double price)
	{
		this.price=price;
	}
	void setdiscount(double discount)
	{
		this.discount=discount;
	}
	String getlocation()
	{
		return location;
	}
	String getpetrol()
	{
		return petrol;
	}
	int getquantity()
	{
		return quantity;
	}
	double getprice()
	{
		return price;
	}
	double getdiscount()
	{
		return (price*discount)/100;
	}
	double getPurchase()
	{
		return getprice()-getdiscount();
	}
	
	@Override
	public String toString() {
		return "Petrol [location=" + location + ", Type+"
				+ "=" + petrol + ", quantity=" + quantity + ", price=" + price
				+ ", discount=" + discount + "]";
	}
	public static void main(String[] args) {
		Petrol p= new Petrol();
		p.setlocation("Vijayawada");
		p.setpetrol("diesel");
		p.setquantity(5);
		p.setprice(1000);
		p.setdiscount(10);
		System.out.println(p);
		System.out.println("real discount ="+p.getdiscount());
		System.out.println("real rate ="+p.getPurchase());
		

	}

}