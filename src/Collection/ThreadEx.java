package Collection;

public class ThreadEx extends Thread{

	public void run() {
		System.out.println("Thread 1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread());

		ThreadEx th=new ThreadEx();
		th.start();
		
	}

}
