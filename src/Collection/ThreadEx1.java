package Collection;

public class ThreadEx1 extends Thread{
	
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		ThreadEx1 th=new ThreadEx1();
		th.run();
		
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
