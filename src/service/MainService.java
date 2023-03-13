package service;

import dataStr.MyLinkedList;

public class MainService {

	public static void main(String[] args) {
		try {
		MyLinkedList<String> stringList = new MyLinkedList<>();
		
		System.out.println("----ADD----");
		stringList.add("Karina"); 	//Karina
		stringList.add("Jānis"); 	//Karina Jānis
		stringList.print(); 		//Karina Jānis
		stringList.add("Jana", 0);	//Jana Karina Jānis
		stringList.add("Līga", 2);	//Jana Karina Līga Jānis
		stringList.print(); 
		
		System.out.println("----REMOVE------");
		stringList.remove(0); 	//Karina Līga Jānis
		stringList.print(); 
		stringList.remove(1);	//Karina Jānis
		stringList.print(); 
		stringList.remove(1);
		stringList.print(); 	//Karina
		//stringList.remove(0); 
		
	}
		catch(Exception e) {
			System.out.println(e);
		}
}
}
