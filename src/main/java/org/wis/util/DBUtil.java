package org.wis.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




public class DBUtil {
	// basic MySQL information
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/Assignment1";
	private static final String MySQLUserName = "root";
	private static final String MySQLUserPassword = "lisu368";
	// basic MySQL connection information
	public static Connection connection = null;
	public static PreparedStatement pstmt=null;
	public static ResultSet rs=null;
	// execute read method
	public static int executeRead(String sql, Object[] params)  {
		

	
		
		try {

			pstmt=creatPreparedStatement(sql,params);
			// execute query
			rs=pstmt.executeQuery();
			while(rs.next()) {
				return 1; // execution is successful
			}
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1; // error in mysql
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1; // error in mysql
		} catch (Exception e) {
			e.printStackTrace();
			return -1; // error in mysql
		}
		finally {
			// close all connection
			closeConnection(rs,pstmt,connection);
		}
		return 0; //execution fail
		
	}
	
	// execute add function
	public static int execteUpdate(String sql, Object[] params)  {
		


	
		
		try {
			pstmt=creatPreparedStatement(sql,params);
			//execute add query
			int count=pstmt.executeUpdate();
			if (count>0) return 1;// execution is successful
					
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1; // error in mysql
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1; // error in mysql
		} catch (Exception e) {
			e.printStackTrace();
			return -1; // error in mysql
		}
		finally {
			// close all connection
			closeConnection(rs,pstmt,connection);
		}
		return 0; //update fail
		
	}
	// get connection method
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(URL, MySQLUserName, MySQLUserPassword);

	}
	// set params into query
	public static PreparedStatement creatPreparedStatement(String sql, Object[] params) throws ClassNotFoundException, SQLException {
		pstmt=getConnection().prepareStatement(sql);
	
		if(params!=null) {
			for(int i=0;i<params.length;i++) {
				pstmt.setObject(i+1, params[i]);
			}
		}
		return pstmt;

	} 
	// close all connection method
	public static void closeConnection(ResultSet rs,PreparedStatement pstmt,Connection connection) {
		try {
			if (rs!=null) rs.close();
			if (pstmt!=null) pstmt.close();
			if (connection!=null) connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
