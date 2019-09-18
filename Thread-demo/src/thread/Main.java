package thread;

public class Main {

	private static Object object = new Object();
	public static int i = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo t1 = new ThreadDemo();
		t1.start();
		
		RunnableDemo t2 = new RunnableDemo();
		Thread t = new Thread(t2);
		t.start();
		
		SynchronizedThread st1 = new SynchronizedThread(object);
		SynchronizedThread st2 = new SynchronizedThread(object);
		st1.start();
		st2.start();
		
		System.out.println("Thread " + Thread.currentThread().getName() + " begins thread ...");
		ThreadLongSleep tl1 = new ThreadLongSleep();
		tl1.start();
		try {
			System.out.println("Thread " + Thread.currentThread().getName() + " waits ....");
			tl1.join();
			System.out.println("Thread " + Thread.currentThread().getName() + " keeps working ...");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thread " + Thread.currentThread().getName() + " begins thread ...");
		ThreadInterrupt ti1 = new ThreadInterrupt();
		ti1.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ti1.interrupt();
	}

}
