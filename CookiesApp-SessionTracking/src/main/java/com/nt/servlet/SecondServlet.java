package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/secondurl")
public class SecondServlet extends HttpServlet {
		public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 PrintWriter pw=res.getWriter();
		 res.setContentType("text/html");
		 
//		 String name=req.getParameter("hname");
//		 String fname=req.getParameter("hfname");
//		 String ms=req.getParameter("hms");
	
		 String f1val1=req.getParameter("f1v1");
		 String f1val2=req.getParameter("f1v2");
		 
		 Cookie cookies[]=req.getCookies();
		 String name=cookies[0].getValue();
		 String fname=cookies[1].getValue();
		 String ms=cookies[2].getValue();
		 
		 pw.println("<h1>First Form Value:"+name+".."+fname+".."+ms+"</h1><br><br>");
		 pw.println("<h1>Second Form Value:"+f1val1+".."+f1val2+"</h1>");
		 
		 pw.println("<br><a href='HomePage.html'>Home</a>");
			
			
			pw.close();
			
		}		
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}

}
