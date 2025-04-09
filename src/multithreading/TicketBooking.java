package multithreading;

public class TicketBooking {
	
	int totalTk=10;
	//								4
	public void bookingTicket(int seats) {


		
		synchronized (this) {
			if(totalTk>=seats) {//10>=3
				System.out.println(seats+" tickets are booked Successfully.");
				totalTk-=seats;//totalTk=7
				System.out.println(totalTk+" tickets are remaining.");
				
			}
			else {
				System.out.println(seats+" tickets are not Available.");
				System.out.println(totalTk+" tickets are remaining.");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TicketBooking obj=new TicketBooking();
		obj.bookingTicket(4);//6
		obj.bookingTicket(4);//2
		obj.bookingTicket(4);//
	}

}
