package multithreading;

public class ThreadEx extends Thread{
	
	public void run() {
		for(int i=1; i<=5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName());
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ThreadEx th=new ThreadEx();
		th.start();
		
		for(int i=1; i<=5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName());
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
