package practice;

public class Addition {

	public static void main(String[] args) {
		
		Runnable rn=()->{
			for(int i=1; i<=4; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName());
			}
		};
		
		Thread th=new Thread(rn);
		th.start();
		
	}
}
