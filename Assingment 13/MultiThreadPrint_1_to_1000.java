
public class MultiThreadPrint_1_to_1000 {

	public static void main(String[] args) {
		
		Task t = new Task();
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		
		t1.start();
		t2.start();
		

	}

}
