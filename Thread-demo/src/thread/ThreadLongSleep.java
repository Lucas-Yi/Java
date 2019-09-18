package thread;

public class ThreadLongSleep extends Thread{
	
	public void run() {
		
		System.out.println("Thread " + Thread.currentThread().getName() + " begins thread ...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("Thread " + Thread.currentThread().getName() + " ends thread ...");
	}

}
