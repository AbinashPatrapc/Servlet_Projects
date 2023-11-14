package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MarriageAgeServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw=res.getWriter();
				
		res.setContentType("text/html");
		
		String name=req.getParameter("pname");
		String tage=req.getParameter("page");
		int age=Integer.parseInt(tage);
		//String gender=req.getParameter("pgen");
		
	}

}
