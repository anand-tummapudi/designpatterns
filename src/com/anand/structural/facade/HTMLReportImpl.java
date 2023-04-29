package com.anand.structural.facade;

import java.sql.Connection;

public class HTMLReportImpl implements HTMLReport{

	@Override
	public void generateHTMLReport(Connection connection, String tableName) {
		System.out.println("HTML Report generated successfully");		
	}

}
