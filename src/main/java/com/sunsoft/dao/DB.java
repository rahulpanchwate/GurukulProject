package com.sunsoft.dao;
import java.sql.*;
public class DB {
public static Connection getCon(){
	Connection con=null;
	
	try{ Class.forName("com.mysql.cj.jdbc.Driver");
	  con=DriverManager.getConnection("mysql://us-cdbr-east-02.cleardb.com/heroku_8323cf59c4fd5c5?reconnect=true","bf86e4a6725dd1","ed2390ec");
	  if (con!=null)
		{
			System.out.println("Connect...");
		}
		else
		{
			System.out.println("Sorry! You Have Problem");
		}
	  }catch(Exception ex){
		  System.out.println(ex);
		  } return con;
	
	
		/*
		 * try{ Class.forName("oracle.jdbc.driver.OracleDriver");
		 * con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
		 * "system","manager"); }catch(Exception ex){System.out.println(ex);} return
		 * con;
		 */
}
}
