package multiThreading;

class MyRunnable1 implements Runnable {
	@Override
	public void run() {
		System.out.println("Thread execution 1 " + Thread.currentThread().getName());
	}
}

class MyRunnable2 implements Runnable {
	@Override
	public void run() {
		System.out.println("Thread execution 2 " + Thread.currentThread().getName());
	}
}

public class PerformingMultipleTaskFromMultipleThreadUsingRunnableInteface {

	public static void main(String[] args) {
		MyRunnable1 task1 = new MyRunnable1();
		MyRunnable2 task2 = new MyRunnable2();

		Thread t1 = new Thread(task1);
		t1.start();

		Thread t2 = new Thread(task2);
		t2.start();

	}

}
