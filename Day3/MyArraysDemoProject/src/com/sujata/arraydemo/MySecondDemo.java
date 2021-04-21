package com.sujata.arraydemo;

import java.util.Scanner;

public class MySecondDemo {

	public static void main(String[] args) {
		int arr[];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Total No of elements in an Array : ");
		int total=sc.nextInt();
		
		arr=new int[total];
		
		for(int index=0;index<total;index++){
			System.out.println("Enter element : ");
			arr[index]=sc.nextInt();
		}
		
		int count=0;
		//used for traversal , not for insertion
		for(int element:arr){
			if(element%2==0)
				count++;
			System.out.println(element);
		}
		
		System.out.println("Total No of even elements : "+count);

	}

}
