package com.anand.structural.bridge;

public class BridgeClient {

	public static void main(String[] args) {
		
		Shape square = new Square(new Blue());
		String blueSquare = square.draw();
		
		System.out.println(blueSquare);
		
		System.out.println("--------------------");
		
		Shape rectangle = new Rectangle(new Red());
		String redRectangle = rectangle.draw();
		
		System.out.println(redRectangle);
	
	}

}
