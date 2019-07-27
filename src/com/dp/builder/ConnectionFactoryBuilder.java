package com.dp.builder;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactoryBuilder {

	private  String driverClass = "com.mysql.jdbc.Driver";
	private  String jdbcUrl = "jdbc:mysql://localhost:3306/transactionstest";
	private  String user = "root";
	private  String password = "root";

	public ConnectionFactory build() {
		ComboPooledDataSource cpds = new ComboPooledDataSource();
		try {
			cpds.setDriverClass(driverClass);
			cpds.setJdbcUrl(jdbcUrl);
			cpds.setUser(user);
			cpds.setPassword(password);
			System.out.println("mysql数据库连接成功！");
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}
		ConnectionFactory connectionFactory = new ConnectionFactory();
		connectionFactory.setDataSource(cpds);
		return connectionFactory;
	}

	public String getDriverClass() {
		return driverClass;
	}

	public ConnectionFactoryBuilder setDriverClass(String driverClass) {
		this.driverClass = driverClass;
		return this;
	}

	public String getJdbcUrl() {
		return jdbcUrl;
	}

	public ConnectionFactoryBuilder setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
		return this;
	}

	public String getUser() {
		return user;
	}

	public ConnectionFactoryBuilder setUser(String user) {
		this.user = user;
		return this;
	}

	public String getPassword() {
		return password;
	}

	public ConnectionFactoryBuilder setPassword(String password) {
		this.password = password;
		return this;
	}

	public static class ConnectionFactory {

		private ComboPooledDataSource cpds;

		private ConnectionFactory() {

		}

		public Connection getConnection() throws SQLException {
			return cpds.getConnection();
		}

		public DataSource getDataSource() {
			return cpds;
		}

		public void setDataSource(ComboPooledDataSource dataSource) {
			this.cpds = dataSource;

		}
	}
}
