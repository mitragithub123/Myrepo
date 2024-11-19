package multiThreading;

public class PerformingSingleTaskFromMultipleThreadUsingRunnableInterface implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread execution " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		PerformingSingleTaskFromMultipleThreadUsingRunnableInterface ob = new PerformingSingleTaskFromMultipleThreadUsingRunnableInterface();

		Thread t1 = new Thread(ob);
		t1.start();

		Thread t2 = new Thread(ob);
		t2.start();

	}
}
