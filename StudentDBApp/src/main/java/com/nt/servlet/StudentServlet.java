package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class StudentServlet extends HttpServlet {
	private static final String GET_STUDENT_DETAILS_BY_ROLLNO="SELECT STUD_NAME,STUD_ADD,STUD_AVG FROM STUDENT WHERE STUD_ROLL=?";
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		int no=Integer.parseInt(req.getParameter("sno"));
		System.out.println("parameter value"+no);
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
	try {
		ServletConfig cg=getServletConfig();
		
		String driver=cg.getInitParameter("driver");
		String url=cg.getInitParameter("url");
		String user=cg.getInitParameter("user");
		String pswd=cg.getInitParameter("pswd");
		
		Class.forName(driver);
		
		con=DriverManager.getConnection(url,user,pswd);
		if(con!=null)
		ps=con.prepareStatement("GET_STUDENT_DETAILS_BY_ROLLNO");
		if(ps!=null)
		ps.setInt(1, no);
		rs=ps.executeQuery();
		
		if(rs.next()) {
			pw.print("<h2 style='color:pink'>Student Name:"+rs.getString("STUD_NAME")+"</h2>");
			pw.print("<h2 style='color:pink'>Student Address:"+rs.getString("STUD_ADD")+"</h2>");
			pw.print("<h2 style='color:pink'>Student Average:"+rs.getString("STUD_AVG")+"</h2");
			
			
			
			
		}else {
			pw.print("<h1 style='color:red'>STUDENT NOT FOUND</h1>");
		}
		pw.print("<a href='Home.html'>HOME</a>");
		
	
	
	}catch(SQLException se) {
	    se.printStackTrace();
	    pw.println("<h1 style='color:red'>DataBase Related Issue:"+se.getMessage()+"</h1>");
	}catch(Exception e) {
		e.printStackTrace();
		pw.println("<h1 style='color:red'>Unknown Issue:"+e.getMessage()+"</h1>");
	}
		finally {
			try {
				if(con!=null)
				con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			try {
				if(ps!=null)
				ps.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			try {
				if(rs!=null)
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


