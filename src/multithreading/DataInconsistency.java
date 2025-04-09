package multithreading;

public class DataInconsistency extends Thread{
	
	static TicketBooking obj;
	
	public void run() {
		
		obj.bookingTicket(4);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 obj=new TicketBooking();

		DataInconsistency th=new DataInconsistency();
		th.start();

		DataInconsistency th1=new DataInconsistency();
		th1.start();

		DataInconsistency th2=new DataInconsistency();
		th2.start();
	}

}
