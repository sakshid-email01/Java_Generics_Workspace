package com.example.demo;

class Data<K extends Integer,V extends String> {
	private K key;
	private V value;
	public Data(K key, V value) {
		this.key = key;
		this.value = value;
	}
	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	public <N extends Number, E extends Character> void display(N number, E element){
		System.out.println("Element: "+element+" Number: "+number);
	}
	
}

public class Main {

	public static void main(String[] args) {
		Data<Integer,String> data = new Data<Integer,String>(1, "value" );
		data.display(1, '$');
	}
}
