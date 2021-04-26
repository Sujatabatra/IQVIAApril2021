package com.sujata.demo;

/*
 * Checked exception : Compiler will force developer to check for exceptions
 */
public class MyThrowsDemo {

	//we are telling the compiler don't worry i am managing the exception but is not handling them
	public static void main(String[] args) throws InterruptedException {

		System.out.println("Hi Everyone I am going to sleep for 2 mins!!!!");

//		try {
			Thread.sleep(2000);// 2000 millisecond
//		} 
//		catch (InterruptedException e) {
//			e.printStackTrace();
//		}

		System.out.println("Hi Everyone I woke up from  sleep after 2 mins!!!!");

	}

}
