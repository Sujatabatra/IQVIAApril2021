package com.sujata.demo;

import java.util.Scanner;

public class Matric {

	private int arr[][];
	private int rows,cols;
	
	public Matric(int rows,int cols){
		arr=new int[rows][cols];
		this.rows=rows;
		this.cols=cols;
	}
	
	public void displayMatric(){
		for(int row=0;row<rows;row++){
			for(int col=0;col<cols;col++){
				System.out.print(arr[row][col]+"   ");
			}
			System.out.println("");
		}
	}
	
	public void inputMatric(){
		Scanner scanner=new Scanner(System.in);
		for(int row=0;row<rows;row++){
			for(int col=0;col<cols;col++){
				System.out.println("Enter element : ");
				arr[row][col]=scanner.nextInt();
			}
		}
	}
	
	public void sumMatrices(Matric m1,Matric m2){
		for(int row=0;row<rows;row++){
			for(int col=0;col<cols;col++){
				arr[row][col]=m1.arr[row][col]+m2.arr[row][col];
			}
		}
	}
}
