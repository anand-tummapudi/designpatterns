package com.anand.structural.adaptor;

public class MobileAdaptorImpl implements MobileAdaptor{

	private WallSocket wallSocket;
	 
	
	MobileAdaptorImpl(WallSocket wallSocket) {
		super();
		this.wallSocket = wallSocket;
	}


	@Override
	public Volt getVolts() {
		Volt v240 = wallSocket.getVolts();
		int v3 = v240.getVolts()/80;
		return new Volt(v3);
	}

}
