package com.batra.training;

//import com.sujata.demo.MySecondClass;
import com.sujata.demo.*;
//import com.sujata.training.*;

public class MyPackageMain {

	public static void main(String args[]){
//		com.sujata.demo.MySecondClass sOb=new com.sujata.demo.MySecondClass();
		MySecondClass sOb=new MySecondClass();
		
		MyThirdClass tOb=new MyThirdClass();
		tOb.method3();
		
		com.sujata.training.MyFirstClass fOb=new com.sujata.training.MyFirstClass();
	}
}
