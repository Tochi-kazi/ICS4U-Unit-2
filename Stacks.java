/**
 * Name: Tochi Iroakazi
 * Class: Unit 2-02
 * Definition: Pops object from and Arraylist
 */

import java.util.*;
public class Stacks {
	
	//Creating a stack that stores Integers
	ArrayList<Integer> list = new ArrayList<Integer> (); 

	public void push(int userinput) {
		list.add(userinput);
		System.out.println(list);

	}
	
	public void pop() {
		 list.remove(list.size() - 1);
		System.out.println(list);
	}
}
