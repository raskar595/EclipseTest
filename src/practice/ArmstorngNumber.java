package practice;

import java.util.Scanner;

public class ArmstorngNumber {
	
	public int count(int a) {
		int res=0;
		
		while(a!=0) {
			a/=10;
			res++;
		}
		return res;
	}
	
	public int pow(int a,int b) {
		int res=1;
		for(int i=1; i<=b; i++) {
			res*=a;
		}
		return res;
	}
	//						123
	public  void armstrong(int n) {
		
		int temp=n;//123
		int rem=0;
		int res=0;
		
		while(temp!=0) {//0!=0
			rem=temp%10;//rem=1
			res=res+pow(rem,count(n));//res=36
			temp=temp/10;//temp=0
		}
		//36==123
		if(res==n) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		ArmstorngNumber obj=new ArmstorngNumber();
		
		System.out.println("Enter the number to check given number is Armstrong or Not: ");
		int n=sc.nextInt();		
		
		obj.armstrong(n);
	}

}
