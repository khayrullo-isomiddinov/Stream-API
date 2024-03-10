package stream;

public class Main extends Thread{
	public static int result = 1;
	
	private int n;
	Main(int x) {n = x; }
	
	public void fac() {
		if(n <= 1) {
			result *= 1;
			return;
		}
		result *= n;
		Main thread = new Main(n-1);
		thread.start();
	}
	
	public void run() {
		fac();
	}
	
	public static void main(String[] args) throws InterruptedException {
		Main thread = new Main(5);
		thread.fac();
		System.out.println(result);
	}
}
