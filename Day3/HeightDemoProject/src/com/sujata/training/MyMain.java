package com.sujata.training;

import com.sujata.demo.ConvertHeight;
import com.sujata.demo.Height;

public class MyMain {

	public static void main(String[] args) {
		ConvertHeight cOb=new ConvertHeight();
		cOb.setHeightInInches(185);
		Height h=cOb.getHeightInFeetAndInches();
		System.out.println(h.getFeet()+" feet "+h.getInches()+" inches ");
		
		
		Height h1=new Height();
		h1.setFeet(5);
		h1.setInches(5);
		Height h2=new Height();
		h2.setFeet(6);
		h2.setInches(2);
		
		Height sum=new Height();
		
		sum.addHeight(h1, h2);
		System.out.println("Sum of heights : "+sum.getFeet()+" feets "+sum.getInches()+" inches");
		

	}

}
