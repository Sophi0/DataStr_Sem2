package service;

import dataStr.MyLinkedList;

public class MainService {

	public static void main(String[] args) {
		try {
		MyLinkedList<String> stringList = new MyLinkedList<>();
		stringList.add("Karina"); 	//Karina
		stringList.add("Jānis"); 	//Karina Jānis
		stringList.print(); 		//Karina Jānis
		stringList.add("Jana", 0);	//Jana Karina Jānis
		stringList.add("Līga", 2);	//Jana Karina Līga Jānis
		stringList.print(); 
	}
		catch(Exception e) {
			System.out.println(e);
		}
}
}
