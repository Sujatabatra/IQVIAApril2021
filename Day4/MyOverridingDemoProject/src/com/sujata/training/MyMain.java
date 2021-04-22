package com.sujata.training;

import com.sujata.demo.ButterPopCorn;
import com.sujata.demo.CaramelPopCorn;
import com.sujata.demo.PopCorn;
import com.sujata.demo.ShoppingMall;
/*
 * Dynamic Method dispatch:
 * Base class reference variable is type compatible with derived class,
 * but reverse is not true
 */
public class MyMain {

	public static void main(String[] args) {
//		PopCorn popcorn; //reference variable
//		
//		popcorn=new PopCorn(); //object
//		
//		
//		popcorn.pop();
//		
//		
//		popcorn=new ButterPopCorn();
//		
//		popcorn.pop();
		
		ShoppingMall sm=new ShoppingMall();
		sm.buyPopCorn(new CaramelPopCorn());

	}

}
