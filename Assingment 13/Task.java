
public class Task implements Runnable {

	@Override
	public synchronized void run() {
		
		int i;
		for(i=0;i<1001;i++)
		{
			System.out.println("Thread Name - " + Thread.currentThread().getName() + " Count - " + i);
			
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		//System.out.println("Thread Name - " + Thread.currentThread().getName() + " Count - " + i);
	}

}
