package com.sujata.demo;

import java.util.Scanner;
/*
 * Unchecked exceptions are not checked by compiler : depending upon programmer domain knowledge programmer checks for it
 */
public class MyFirstDemoClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int location=0;
		try {
			System.out.println("Enter First No. :");
			int number1 = sc.nextInt();
			System.out.println("Enter Second No. :");
			int number2 = sc.nextInt();

			int result = number1 / number2;
			System.out.println("Result : " + result);
			
			int arr[];
			System.out.println("Enter total no of elements : ");
			int total=sc.nextInt();
			arr=new int[total];
			
			for(int index=0;index<total;index++){
				System.out.println("Enter value in an array: ");
				arr[index]=sc.nextInt();
			}
			
			System.out.println("Enter location of array whoes value you want to view :  ");
			location=sc.nextInt();
			
			System.out.println("Value at location "+location+" : "+arr[location]);
			
			
			
			System.out.println("End of try block!");
			
		}
		//specific handler
		catch (ArithmeticException ex) {
			System.out.println("Infinity");
		}
		//specific handler
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Element at location "+location+" does not exist");
		}
		//specific handler
		catch(NegativeArraySizeException ex){
			System.out.println("Array size can never b negative");
		}
		//generic handler
//		catch(Exception ex){
//			System.out.println("Some exception arise kindly try after sometime!");
//		}
		/*
		 * finally block will execute irrespective of we get exception or we don't get exception
		 */
		finally{
			System.out.println("Hi I am finally block");
		}
		System.out.println("Good Bye from main!");
	}

}
