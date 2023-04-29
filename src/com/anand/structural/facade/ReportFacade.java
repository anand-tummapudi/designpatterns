package com.anand.structural.facade;

import java.sql.Connection;

public class ReportFacade {
	
	private PDFReport pdfReport;
	private HTMLReport htmlReport;
	private ExcelReport excelReport;
	
	public ReportFacade() {
		pdfReport = new PDFReportImpl();
		htmlReport = new HTMLReportImpl();
		excelReport = new ExcelReportImpl();
		}

	public void generatePDFReport(Connection connection, String tableName) {
		pdfReport.generatePDFReport(connection, tableName);
	}
	
	public void generateHTMLReport(Connection connection, String tableName) {
		htmlReport.generateHTMLReport(connection, tableName);
	}
	
	public void generateExcelReport(Connection connection, String tableName) {
		excelReport.generateExcelReport(connection, tableName);
	}
}
