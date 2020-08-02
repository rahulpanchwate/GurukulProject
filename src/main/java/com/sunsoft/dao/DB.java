package com.sunsoft.dao;
import java.sql.*;
public class DB {
public static Connection getCon(){
	Connection con=null;
	
	try{ Class.forName("com.mysql.cj.jdbc.Driver");
	  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gurukulschool","root","root");
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
