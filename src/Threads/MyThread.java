package Threads;
//Programming the thread Creation

public class MyThread extends Thread{
	public void run() {
		System.out.println("Concurrent thread Started Running");
	}

	public static void main(String[] args) {
		
		MyThread mt=new MyThread();
		mt.start();
		

	}

}
