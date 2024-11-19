package multiThreading;

public class PerformingSingleTaskFromMultipleThreadUsingThreadClass extends Thread {

	@Override
	public void run() {
		System.out.println("Thread execution " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		PerformingSingleTaskFromMultipleThreadUsingThreadClass t1 = new PerformingSingleTaskFromMultipleThreadUsingThreadClass();
		t1.start();

		PerformingSingleTaskFromMultipleThreadUsingThreadClass t2 = new PerformingSingleTaskFromMultipleThreadUsingThreadClass();
		t2.start();
	}
}
