package com.sujata.training;

import com.sujata.demo.Rectangle;
import com.sujata.demo.Square;

public class MainShapes {

	public static void main(String[] args) {
		Square sq=new Square();
		sq.setNumber(6);
		sq.area();
		sq.perimeter();
		
		Rectangle rectangle=new Rectangle(4, 9);
		rectangle.area();
		rectangle.perimeter();

	}

}
