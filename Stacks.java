/**
 * Name: Tochi Iroakazi
 * Class: Unit 2-02
 * Definition: Pops object from and Arraylist
 */

import java.util.*;
public class Stacks {
	
	//Creating an arraylist that stores Integers
	ArrayList<Integer> list = new ArrayList<Integer> (); 

	public void push(int userinput) {
		list.add(userinput);
		System.out.println("Whats in the list" + list);

	}
	
	public void pop() {
		//list.remove(list.size() - 1);
		//System.out.println(list);
		if (list.size() == 0) {
			 throw new EmptyStackException();
		}else {
			list.remove(list.size() - 1);
			System.out.println("After poping" + list);
			
		}
		//list.remove(list.size() - 1);
		//System.out.println(list);
	}
	
	public void peek() {
		System.out.println("The number at the top of the list is: " + list.get(list.size()-1));
	}
	
	public void clear() {
		list.clear();
		System.out.println("Whats in the list after clearing: " + list);
	}
}
