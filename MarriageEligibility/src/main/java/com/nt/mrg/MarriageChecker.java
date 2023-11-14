package com.nt.mrg;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MarriageChecker
 */
public class MarriageChecker extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		String name=req.getParameter("name");
		String gender=req.getParameter("gen");
		int age=Integer.parseInt(req.getParameter("age"));
		String country=req.getParameter("county");
		
		pw.print("NAME:: "+name+"<br>");
		pw.print("GENDER:: "+gender+"<br>");
		pw.print("AGE:: "+age+"<br>");
		pw.print("COUNTRY NAME:: "+country+"<br>");
		
		if(gender.equals("male")) {
			if(age>=21) 
				 pw.println("<h1 style='color:green;text-align:center'>" + name +" You are Eligible for Marriage</h1>");
				else
					pw.println("<h1 style='color:red;text-align:center'>"+name+" "+ "You are not Eligible for Marriage</h1>");
		}else if(gender.equals("female")) {
			if(age>=18)
				pw.println("<h1 style='color:green;text-align:center'>" + name +" You are Eligible for Marriage</h1>");
			else
				pw.println("<h1 style='color:red;text-align:center'>"+name+" "+ "You are not Eligible for Marriage</h1>");
		}else
			pw.print("Invalid Age");
		
		
		 pw.println("<br><br><h4 style=text-align:center><a href='http://localhost:3030/MarriageEligibility/Index.html'>HOME</a></h4>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
