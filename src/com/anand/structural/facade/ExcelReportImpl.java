package com.anand.structural.facade;

import java.sql.Connection;

public class ExcelReportImpl implements ExcelReport{

	@Override
	public void generateExcelReport(Connection connection, String tableName) {
		System.out.println("Excel report generated successfully.");		
	}

}
