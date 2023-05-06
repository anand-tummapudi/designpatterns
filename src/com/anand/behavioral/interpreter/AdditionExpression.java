package com.anand.behavioral.interpreter;

public class AdditionExpression implements Expression {
	
	private String expression;
	
	public AdditionExpression(String expression) {
		this.expression = expression;
	}

	@Override
	public int interpret(InterpreterEngine interPreterengine) {
		return interPreterengine.addition(expression);
	}

}
