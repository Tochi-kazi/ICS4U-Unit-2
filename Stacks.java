/**
 * Name: Tochi Iroakazi
 * Class: Unit 2-03
 * Definition: Pops object from and Arraylist
 */

import java.util.*;
public class Stacks {
	
	//Creating an arraylist that stores Integers
	 ArrayList<Integer> list = new ArrayList<Integer> (); 
	int size = list.size() - 1;

	public void push(int userinput) {
		list.add(userinput);
		System.out.println("Whats in the list" + list);

	}
	
	public void pop() {
		//list.remove(list.size() - 1);
		//System.out.println(list)
		try {
			list.remove(size);
			System.out.println("After poping" + list);
		}catch (Exception e) {
			//e.printStackTrace();
			System.out.println("The arraylist is empty");
		}

	}
	
	public void peek() {
		System.out.println("The number at the top of the list is: " + list.get(list.size()-1));
	}
	
	public void clear() {
		list.clear();
		System.out.println("Whats in the list after clearing: " + list);
	}
}
