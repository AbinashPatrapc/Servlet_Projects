package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SeasonGeneratorServlet extends HttpServlet {

	@Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	res.setContentType("text/html");
    	
    	PrintWriter pw =res.getWriter();
    	
    	LocalDate ldt =LocalDate.now();
    	
    	int month=ldt.getMonthValue();
    	
    	if(month>=3 && month<=6 )
    		pw.println("<h1 style='color:green;text-align:center'>Name of the Season is:Summer</h1>");
    	else if(month>=7 && month<=10)
    		pw.println("<h1 style='color:green;text-align:center'>Name of the Season is:Rainy</h1>");
    	else
    		pw.println("<h1 style='color:green;text-align:center'>Name of the Season is:Winter</h1>");
    	
    	pw.println("<br><br><h4 style=text-align:center><a href='http://localhost:3030/SeasonApp/homepage.html'>HOME</a></h4>");
    	
    	pw.close();
    		 	  
    	  
    }
	
}
