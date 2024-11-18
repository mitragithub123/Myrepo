package multiThreading;

public class ImplementingRunnableInterface implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread is running: " + Thread.currentThread().getName());

	}

	public static void main(String[] args) {
		ImplementingRunnableInterface ob = new ImplementingRunnableInterface();
		Thread t1 = new Thread(ob);
		t1.start();
	}

}
