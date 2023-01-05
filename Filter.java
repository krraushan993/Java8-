// Find the even number using stream.
// filter() :- To filter elements based on some condition.
//Input :-[72, 23, 84, 22, 12, 55, 12, 66]
//Output: -[72, 84, 22, 12, 12, 66]



package streamConcept;

import java.util.ArrayList;
import java.util.List;

public class Filter {

	public static void main(String[] args) {

		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(72);
		l1.add(23);
		l1.add(84);
		l1.add(22);
		l1.add(12);
		l1.add(55);
		l1.add(12);
		l1.add(66);
		System.out.println(l1);
		List<Integer> l2 = l1.stream().filter(i -> i % 2 == 0).toList();
		System.out.println("Even numbers " + l2);

	}

}


