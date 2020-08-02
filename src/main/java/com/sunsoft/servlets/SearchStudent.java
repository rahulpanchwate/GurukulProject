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
@WebServlet("/SearchStudent")
public class SearchStudent extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String srollno=request.getParameter("rollno");
		int rollno=Integer.parseInt(srollno);
		StudentBean bean=StudentDao.getRecordByRollno(rollno);
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Search Student</title>");
		out.println("<link rel='stylesheet' href='resources/bootstrap.min.css'/>");
		out.println("<link rel='stylesheet' href='style.css'/>");
		out.println("</head>");
		out.println("<body>");
		request.getRequestDispatcher("navaccountant.html").include(request, response);
		out.println("<div class='container'>");
		
	
		out.println("<h1>Search Student</h1>");
		out.print("Reg. No:<input type='text' name='name' value='"+bean.getRollno()+"' />");
		out.print("</br></br>");
		out.print("Pupil Name:<input type='text' name='name' value='"+bean.getName()+"' />");
		out.print("</br>");
		out.print("Class:<input type='text' name='name' value='"+bean.getCourse()+"' />");
		out.print("</br>");
		if(bean.getRollno()>0){
		out.println("<table class='table table-bordered table-striped'>");
		out.print("<tr><th>Sr. No.</th><th>Particulars Of Fees</th><th>AMOUNT</th></tr>");
		//out.print("<tr><th>1</th><td>Reg. No:</td><td>"+bean.getRollno()+"</td></tr>");
		//out.print("<tr><th>2</th><td>Name:</td><td>"+bean.getName()+"</td></tr>");
		//out.print("<tr><td>Email:</td><td>"+bean.getEmail()+"</td></tr>");
		//out.print("<tr><th>3</th><td>Sex:</td><td>"+bean.getSex()+"</td></tr>");
		//out.print("<tr><th>4</th><td>Course:</td><td>"+bean.getCourse()+"</td></tr>");
		out.print("<tr><th>5</th><td>Fee:</td><td>"+bean.getFee()+"</td></tr>");
		out.print("<tr><th>6</th><td>First Installment:</td><td>"+bean.getF_inst()+"</td></tr>");
		out.print("<tr><th>7</th><td>Second Installment:</td><td>"+bean.getS_inst()+"</td></tr>");
		out.print("<tr><th>8</th><td>Third Installment:</td><td>"+bean.getT_inst()+"</td></tr>");
		//out.print("<tr><th>9</th><td>Due:</td><td>"+bean.getDue()+"</td></tr>");
		out.print("</table>");
		}else{
			out.println("<p>Sorry, No Record found for "+rollno+"</p>");
		}
		
		out.println("</div>");
		request.getRequestDispatcher("footer.html").include(request, response);
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}
}
