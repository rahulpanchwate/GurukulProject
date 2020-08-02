
package com.sunsoft.servlets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sunsoft.beans.StudentBean;
import com.sunsoft.dao.StudentDao;

import java.sql.*;
@WebServlet("/AddStudent")
public class AddStudent extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("name");
		String mname=request.getParameter("MiddleName");
		String lname=request.getParameter("LastName");
	 	//String email=request.getParameter("email");
		int rno=Integer.parseInt(request.getParameter("rollno"));
		String sex=request.getParameter("sex");
		String course=request.getParameter("course");
		int fee=Integer.parseInt(request.getParameter("fee"));
		int fist_inst=Integer.parseInt(request.getParameter("finstallment"));
		int second_inst=Integer.parseInt(request.getParameter("secdinstallment"));
		int third_inst=Integer.parseInt(request.getParameter("thirdinstallment"));
		int paid=Integer.parseInt(request.getParameter("paid"));
		int due=Integer.parseInt(request.getParameter("due"));
		String address=request.getParameter("address");
		String contact=request.getParameter("contact");
		
		System.out.println("paid"+paid+" mname "+mname+" lname "+lname);
		
		StudentBean bean=new StudentBean(rno, name, mname, lname, sex, course, fee, fist_inst, second_inst, third_inst, paid, due, address, contact);
		int status=StudentDao.save(bean);
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Add Student</title>");
		out.println("<link rel='stylesheet' href='resources/bootstrap.min.css'/>");
		out.println("<link rel='stylesheet' href='style.css'/>");
		out.println("</head>");
		out.println("<body>");
		request.getRequestDispatcher("navaccountant.html").include(request, response);
		out.println("<div class='container'>");
		
		out.println("Student is added successfully!");
		
		request.getRequestDispatcher("AddStudentForm.html").include(request, response);
		out.println("</div>");
		request.getRequestDispatcher("footer.html").include(request, response);
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}

}
