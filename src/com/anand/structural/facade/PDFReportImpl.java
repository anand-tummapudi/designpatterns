package com.anand.structural.facade;

import java.sql.Connection;

public class PDFReportImpl implements PDFReport{

	@Override
	public void generatePDFReport(Connection connection, String tableName) {
		System.out.println("PDF report generated successfully.");
	}

}
