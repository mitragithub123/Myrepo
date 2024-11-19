package multiThreading;

class Mythread1 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread execution 1 " + Thread.currentThread().getName());
	}
}

class Mythread2 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread execution 2 " + Thread.currentThread().getName());
	}
}

public class PerformingMultipleTaskFromMultipleThreadUsingThreadClass {

	public static void main(String[] args) {
		Mythread1 t1 = new Mythread1();
		t1.start();

		Mythread2 t2 = new Mythread2();
		t2.start();
	}

}
