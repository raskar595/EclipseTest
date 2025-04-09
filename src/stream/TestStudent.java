package stream;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> list=new ArrayList<Student>();
		
		list.add(new Student(101, "Suraj Raskar", "Pune", 77));
		list.add(new Student(102, "Dhiraj Raskar", "Pune", 89));
		list.add(new Student(103, "Rohan Raskar", "Saswad", 85));
		list.add(new Student(104, "Neha Raskar", "Nira", 73));
		
	list.stream().filter(s->s.marks >= 80).limit(1).forEach(stud-> System.out.println(stud.name));

	list.stream().filter(s -> s.city.equals("Pune")).forEach(stud->System.out.println(stud));
	}

}
