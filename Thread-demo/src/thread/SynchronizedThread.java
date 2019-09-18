package thread;

public class SynchronizedThread extends Thread{

	Object object;
	
	public SynchronizedThread(Object object) {
		this.object = object;
	}	
	
	public void run() {
		synchronized (object) {
			Main.i++;
			System.out.println("i = " + Main.i);
			try {
				System.out.println("Thread "+ currentThread().getName() + "enter sleeping...");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			System.out.println("Thread " + currentThread().getName() + "end sleeping..." );
			Main.i++;
			System.out.println("i = " + Main.i);
		}
	}
}
