package Adapter2;

public class GBDeno {

	public static void main(String[] args) {
		Girl g1=new Girl1();
		Boy b1=new Boy();
		Girl gb1=new GB(b1);
		gb1.eat();
	}

}
