package com.anand.structural.composit;

import java.util.ArrayList;
import java.util.List;

public class ServiceProvider implements Service{
	
	private List<Service> serviceList = new ArrayList<>();

	@Override
	public void service(String serviceType) {
		
		for(Service service:serviceList) {
			service.service(serviceType);
		}
	}
	
	public void addService(Service serviceType) {
		serviceList.add(serviceType);
	}
	
	public void deleteService(Service serviceType) {
		serviceList.remove(serviceType);
	}
	
	public void clearServiceList() {
		serviceList.clear();
	}

}
