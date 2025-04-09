package Operators;

import java.util.ArrayList;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student obj=new Student(101, "Suraj Raskar", "Pune", 77);
		Student obj1=new Student(102, "Dhiraj Raskar", "Warje", 97);
		Student obj2=new Student(103, "Rohan Raskar", "Nira", 85);
		Student obj3=new Student(104, "Yash Raskar", "Kedgaon", 100);
		
		ArrayList<Student> list=new ArrayList<Student>();
		
		list.add(obj);
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		
		System.out.println(list);
		
		

	}

}
