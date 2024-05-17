package com.example.demo;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Data<T>{
	private T myVariable;
 
	public Data(T myVariable) {
		super();
		this.myVariable = myVariable;
	}
 
	public T getMyVariable() {
		return myVariable;
	}
 
	@Override
	public String toString() {
		return "Data [myVariable=" + myVariable + "]";
	}
	
}

public class Main {

	public static void main(String[] args) {

		List<Data<Object>> elements = new LinkedList<>();
		elements.add(new Data<Object>("Some text"));
		elements.add(new Data<Object>(1.0));
		elements.add(new Data<Object>(1));
		elements.add(new Data<Object>('%'));
		elements.add(new Data<Object>(5.0f));
		
		Main app = new Main();
		app.printList(elements);

	}
	void printList(List<Data<Object>> list) {
		ListIterator<Data<Object>> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println("Element: " + iterator.next());}
	}

}
