package com.anand.behavioral.state;

public class StateClient {
	
	/*
	 * private String state;
	 * 
	 * public void setState(String state) { this.state = state; }
	 * 
	 * public void doAction() { if("ON".equalsIgnoreCase(state)) {
	 * System.out.println("AC is ON"); }else if("OFF".equalsIgnoreCase(state)) {
	 * System.out.println("AC is OFF"); } }
	 */
	public static void main(String[] args) {
		/*
		 * StateClient remoteTest = new StateClient(); remoteTest.setState("ON");
		 * remoteTest.doAction();
		 * 
		 * remoteTest.setState("OFF"); remoteTest.doAction();
		 */
		
		ACRunner acRunner = new ACRunner();
		State startState = new ACStartState();
		acRunner.setState(startState);
		
		acRunner.doAction();
		
		State stopState = new ACStopState();
		acRunner.setState(stopState);
		acRunner.doAction();
	}

}
