package Collection;

import java.util.Scanner;

class InvalidVoterException extends RuntimeException{
	
	public InvalidVoterException(String desc) {
//		super(desc);
	}
}

public class VotingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		
		if(age>=18) {
			System.out.println("Eligible");
		}
		else {
			throw new InvalidVoterException("age is <18");
		}

	}

}
