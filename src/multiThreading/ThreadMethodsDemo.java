package multiThreading;

public class ThreadMethodsDemo extends Thread {

	@Override
	public void run() {
		System.out.println("Thread execution 1 " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		ThreadMethodsDemo t1 = new ThreadMethodsDemo();
		ThreadMethodsDemo t2 = new ThreadMethodsDemo();

		t1.setName("Worker-1");// Setting thread names
		t2.setName("Worker-2");

		t1.setPriority(MAX_PRIORITY);// Setting thread priority (Max=10, Min=1, Default=5)
		t1.setPriority(MIN_PRIORITY);

		System.out.println("Before starting, " + t1.getName() + " is alive: " + t1.isAlive());
		System.out.println("Before starting, " + t2.getName() + " is alive: " + t2.isAlive());

		t1.start();
		t2.start();

		System.out.println(t1.getName() + " state: " + t1.getState());
		System.out.println(t2.getName() + " state: " + t2.getState());

		try {
			t1.join();// Waits for thread1 to complete
			t2.join(); // Waits for thread2 to complete
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}

		System.out.println(t1.getName() + " is alive after execution: " + t1.isAlive());
		System.out.println(t2.getName() + " is alive after execution: " + t2.isAlive());

	}

}
