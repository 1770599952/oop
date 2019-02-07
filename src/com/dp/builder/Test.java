package com.dp.builder;

import java.sql.Connection;
import java.sql.SQLException;

import com.dp.builder.ConnectionFactoryBuilder.ConnectionFactory;

public class Test {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactoryBuilder builder = new ConnectionFactoryBuilder();
		ConnectionFactory connectionFactory =  builder.build();
	 	Connection connection = connectionFactory.getConnection();
	}
}
