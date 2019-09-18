package thread;

public class ThreadInterrupt extends Thread{
	
	public void run(){

		try {
			System.out.println("enters sleeping...");
			Thread.sleep(10000);
			System.out.println("ends sleeping...");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("interrupted");
		}
		System.out.println("thread ends caused by interruption");
		
	}

}
