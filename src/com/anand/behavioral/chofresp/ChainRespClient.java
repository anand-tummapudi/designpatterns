package com.anand.behavioral.chofresp;

import java.util.Scanner;

public class ChainRespClient {

	public static void main(String[] args) {
		
		ATMMachine atmMachine = new ATMMachine();
		Scanner scanner = null;
		while(true) {
			 int amount = 0;
			 try {
				System.out.println("Enter Amount");
				scanner = new Scanner(System.in);
				amount = scanner.nextInt();
				if(amount%100!=0) {
					System.out.println("Amount should be multiple of 100s");
					return;
					}else {
						atmMachine.getMoneyDispenseChain().dispense(new Currency(amount));
					}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} /*
				 * finally { if(scanner!=null) { scanner.close(); } }
				 */
		}
	}

}
