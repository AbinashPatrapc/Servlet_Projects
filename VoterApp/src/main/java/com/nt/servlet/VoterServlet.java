package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class VoterServlet extends HttpServlet {
	
 @Override
public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
	 PrintWriter pw=res.getWriter();
	 
	 res.setContentType("text/html");
	 //Read from data
	 String name=req.getParameter("pname");
	 String tage=req.getParameter("page");
	 int age=Integer.parseInt(tage);
	 if(age>=18) {
		 pw.println("<h1 style='color:green;text-align:center'>" + name +" You are Eligible for voting</h1>");
	 }else {
		 pw.println("<h1 style='color:red;text-align:center'>"+name+" "+ "You are not Eligible for voting</h1>");
	 }
	 
	
	 pw.println("<br><br><h4 style=text-align:center><a href='http://localhost:3030/VoterApp/form.html'>HOME</a></h4>");
	 pw.println("<br><br><h3 style='text-align:center'>"+new java.util.Date()+"</h3>");
	 res.setHeader("refresh","1");//for AutoRefresh
	 pw.close();
	 
	 
}
	
	
	

}
