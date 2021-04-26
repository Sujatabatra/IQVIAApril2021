package com.sujata.demo;

import java.util.ArrayList;

public class PersonMain {

	public static void main(String[] args) {
//		Person person=new Person(111, "AAAA");
//		System.out.println(person);
		
//		Person prr[];
		ArrayList<Person> personList=new ArrayList<>();

		personList.add(new Person(101,"AAA"));
		personList.add(new Person(102,"BBB"));
		personList.add(new Person(103,"CCC"));
		personList.add(new Person(104,"DDD"));
		personList.add(new Person(105,"EEE"));
		
		System.out.println(personList);
		System.out.println("Total no of persons : "+personList.size());
		System.out.println("=======================");
		for(Person person:personList){
			System.out.println(person);
		}
		
//		personList.remove(2);
		personList.remove(new Person(104,"DDD"));
		System.out.println("Total no of persons : "+personList.size());
		System.out.println("=======================");
		for(Person person:personList){
			System.out.println(person);
		}
		
		personList.add(new Person(999, "XYZ"));
		
		System.out.println("=======================");
		for(Person person:personList){
			System.out.println(person);
		}
	}

}
