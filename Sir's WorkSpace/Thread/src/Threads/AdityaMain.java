package Threads;

class Hi extends Thread{
	public void run() {
	for(int i=0;i<4;i++) {
		System.out.println("HI ");
		try {
			Thread.sleep(500);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	}
}

class Hello extends Thread{
	public void run() {
		for(int i=0;i<4;i++) {
			System.out.println("Aditya");
			try {
			Thread.sleep(500);
			}catch(Exception e) {}
		}
	}
}






public class AdityaMain {

	public static void main(String[] args) {
		Hi ob1 = new Hi();
		Hello ob2 = new Hello();
		
		ob1.start();
		ob2.start();

	}

}
