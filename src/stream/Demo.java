package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=Arrays.asList(1,5,6,54,3);
		
		Predicate<Integer> predi=n-> n%2==1;

		list.stream()
		    .filter(predi)
			.map(n-> n*2)
			.forEach(n-> System.out.println(n));

	}

}
