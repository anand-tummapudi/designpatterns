package com.anand.behavioral.interpreter;

public class InterpreterClient {

	public static void main(String[] args) {
		
		InterpreterEngine interpreterEngine = new InterpreterEngine();
		InterpreterProcessor interpreterProcessor = new InterpreterProcessor(interpreterEngine);
		
		System.out.println("Addition of two numbers:"+interpreterProcessor.interpret("add 200 and 75"));
		System.out.println("########################################");
		System.out.println("Subtraction of two numbers:"+interpreterProcessor.interpret("subtract 30 from 100"));
	}

}
