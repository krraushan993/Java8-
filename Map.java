/* map() :- For every object you want to perform some function and you
 * want some result object then we can go for map .
 * Write a program to add 5 marks in every students.
 * 
 * */

package streamConcept;

import java.util.ArrayList;
import java.util.List;

public class Map {

	public static void main(String[] args) {

		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(15);
		l1.add(45);
		l1.add(77);
		l1.add(19);
		l1.add(45);
		System.out.println("Before add  " + l1);
		List<Integer> l2 = l1.stream().map(i -> i + 5).toList();
		System.out.println("After add  " + l2);
	}

}
