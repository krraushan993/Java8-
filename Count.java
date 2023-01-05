/*count() :- Return the number of elements in a stream.
 * 
 * Write a program to count total number of fail student 
 * whose marks is less than 35.
 * 
 */

package streamConcept;

import java.util.ArrayList;

public class Count {

	public static void main(String[] args) {

		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(12);
		l1.add(13);
		l1.add(45);
		l1.add(55);
		l1.add(65);

		long l2 = l1.stream().filter(i -> i < 35).count();
		System.out.println("Total number of fail student " + l2);
	}

}
