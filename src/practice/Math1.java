package practice;

import java.util.Scanner;

public class Math1 {
	
	public int pow(int a,int b) {
		int res=1;
		for(int i=1; i<=b; i++) {
			res*=a;//res=res*a;
		}
		return res;
	}
	
	public int count(int a) {//155
		
		int res=0;//0
		
		while(a!=0) {//0!=0
			a=a/10;//a=0
			res++;//3
		}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math1 obj=new Math1();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the First value: ");
		int a=sc.nextInt();

		System.out.println("The count of given number: "+obj.count(a));
		
		
		
	}

}
