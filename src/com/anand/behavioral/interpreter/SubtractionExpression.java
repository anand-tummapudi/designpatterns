package com.anand.behavioral.interpreter;

public class SubtractionExpression implements Expression {
	private String expression;
	public SubtractionExpression(String expression) {
		this.expression = expression;
	}

	@Override
	public int interpret(InterpreterEngine interPreterengine) {
		return interPreterengine.subtraction(expression);
	} 
}
