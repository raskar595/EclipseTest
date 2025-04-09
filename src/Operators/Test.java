package Operators;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=4; j++) {
				if(j==1 || (i+j==5)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=2; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				if(j==1 || i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
