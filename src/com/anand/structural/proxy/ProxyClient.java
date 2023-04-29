package com.anand.structural.proxy;

public class ProxyClient {

	public static void main(String[] args) {

		ExpensiveProcess expensiveProc = new ExpensiveProcessProxy();
		expensiveProc.process();
		expensiveProc.process();
		expensiveProc.process();
		expensiveProc.process();
		
	}

}
