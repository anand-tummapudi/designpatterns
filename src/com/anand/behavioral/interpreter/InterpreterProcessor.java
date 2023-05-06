package com.anand.behavioral.interpreter;

public class InterpreterProcessor {
	
	private InterpreterEngine interpreterEngine;
	
	public InterpreterProcessor(InterpreterEngine interpreterEngine) {
		super();
		this.interpreterEngine = interpreterEngine;
	}

	public int interpret(String inputData) {
		Expression expression = null;
		if(inputData.contains("add")) {
			expression = new AdditionExpression(inputData);
		}else if (inputData.contains("subtract")) {
			expression = new SubtractionExpression(inputData);
		}else {
			throw new RuntimeException(inputData+" Id not a valid Expression");
		}
		
		int result = expression.interpret(interpreterEngine);
		System.out.println(inputData);
		return result;
	}

}
