package com.anand.structural.facade;

import java.sql.Connection;

public interface HTMLReport {
	public void generateHTMLReport(Connection connection,String tableName);
}
