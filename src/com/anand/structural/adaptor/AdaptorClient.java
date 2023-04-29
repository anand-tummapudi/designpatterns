package com.anand.structural.adaptor;

public class AdaptorClient {

	public static void main(String[] args) {

		WallSocket wallSocket = new WallSocketImpl();
		Volt v240 = wallSocket.getVolts();
		
		System.out.println(v240);
		
		MobileAdaptor mobileAdaptor = new MobileAdaptorImpl(wallSocket);
		Volt v3 = mobileAdaptor.getVolts();
		
		System.out.println(v3);
	}

}
