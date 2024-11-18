package multiThreading;

public class ExtendingThreadClass extends Thread {

	@Override
	public void run() {
		System.out.println("Thread is running: " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		ExtendingThreadClass t1 = new ExtendingThreadClass();
		t1.start();
	}

}
