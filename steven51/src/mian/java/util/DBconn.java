package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DBconn {
	static String url="jdbc:mysql://steventest2.mysql.database.azure.com:3306/steven?useSSL=true&requireSSL=false&serverTimezone=GMT%2B8";
	static String username="rootsteven@steventest2";
	static String password="XsT1996881234";
	static Connection connection = null;
	static ResultSet resultSet = null;
	static PreparedStatement preparedStatement= null;
	public static void init() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			System.out.println("åˆ�å§‹åŒ–å¤±è´¥");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static int update(String sql) {
		int i=0;
		try {
			preparedStatement=connection.prepareStatement(sql);
			i=preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	public static ResultSet select(String sql) {
		ResultSet resultSet = null;
		try {
			preparedStatement=connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultSet;
	}
	
	public static void close() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
