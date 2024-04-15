package org.ass.springweb.util;

import java.util.Properties;

import org.hibernate.cfg.Environment;

public class ConnectionProperties {
	public static Properties getConnectionProperties() {
		Properties properties = new Properties();
		properties.setProperty(Environment.URL, "jdbc:mysql://localhost:3306/DataBase");
		properties.setProperty(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		properties.setProperty(Environment.USER, "root");
		properties.setProperty(Environment.PASS, "root");
		properties.setProperty(Environment.SHOW_SQL, "true");// print query which hibernate is producing
//		properties.setProperty(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
		properties.setProperty(Environment.DIALECT,"org.hibernate.dialect.MySQL55Dialect");
		
		properties.setProperty(Environment.HBM2DDL_AUTO, "update");
		return properties;

	}
}
