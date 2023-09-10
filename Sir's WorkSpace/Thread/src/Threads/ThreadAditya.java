package Threads;

class PrintHi extends Thread{
	public void run() {
		for(int i=0;i<4;i++) {
			System.out.println("Thread is going to print by the thread " + Thread.currentThread().getName());
			System.out.println("The Priority of the current thread is " + Thread.currentThread().getPriority());
		}
	}
}

class PrintHello implements Runnable{

	@Override
	public void run() {
	   for(int i=0;i<4;i++) {
		   System.out.println("Runnable is going to print by the thread " + Thread.currentThread().getPriority());
	   }
		
	}
	
}




public class ThreadAditya {

	public static void main(String[] args) {
		PrintHi ob1 = new PrintHi();
		ob1.start();
		
		Runnable ob2 = new PrintHello();
		
		Thread t1 = new Thread(ob2);
		t1.setPriority(2);
		t1.start();
		

	}

}
