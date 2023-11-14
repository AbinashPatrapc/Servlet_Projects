package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EmployeeServlet extends HttpServlet {
      private static final String GET_STUDENT_DETAILS_BY_ROLLNO="SELECT STUD_NAME,STUD_ADD,STUD_AVG FROM STUDENT WHERE STUD_ROLL=?"; 
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	     res.setContentType("text/html");
		 PrintWriter pw= res.getWriter();
		 int no=Integer.parseInt(req.getParameter("no"));
		 Connection con=null;
		 PreparedStatement ps=null;
		 ResultSet rs=null;
		 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Abinash","7873");
			if(con!=null)
				ps=con.prepareStatement(GET_STUDENT_DETAILS_BY_ROLLNO);
			    ps.setInt(1, no);
			if(ps!=null)
				rs=ps.executeQuery();
			if(rs.next()) {
				pw.println("<h1 style='color:blue'>Student Name:"+rs.getString(1)+"</h1>");
				pw.println("<h1 style='color:green'>Student Address:"+rs.getString(2)+"</h1>");
				pw.println("<h1 style='color:pink'>Student Average:"+rs.getFloat(3)+"</h1>");
			
		}else {
			pw.println("<h1 style='color:red'>Record Not Found</h1>");
		}
		
		    pw.println("<a href='links.html'>Home</a>");	
			 
	
	}catch(SQLException se) {
	    se.printStackTrace();
	    pw.println("<h1 style='clor:red'>DataBase Related Issue:"+se.getMessage()+"</h1>");
	}catch(Exception e) {
		e.printStackTrace();
		pw.println("<h1 style='clor:red'>Unknown Issue:"+e.getMessage()+"</h1>");
	}
		finally {
			try {
				con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			try {
				ps.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			try {
				rs.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}
	
}


