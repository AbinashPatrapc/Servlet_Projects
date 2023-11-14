package com.nt.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class WishMessageServlet extends HttpServlet {
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
		PrintWriter pw= res.getWriter();
       LocalDateTime ldt=LocalDateTime.now();
       int hour=ldt.getHour();
       
       if(hour<12)
    	   pw.println("<h1 style='color:red; text-align:center'>Good Morning</h1>");
       else if(hour<16)
    	   pw.println("<h1 style='color:green; text-align:center'>Good AfterNoon</h1>");
       else if(hour==12)
    	   pw.println("<h1 style='color:yellow; text-align:center'>Good Noon</h1>");
       else if(hour<20)
    	   pw.println("<h1 style='color:pink; text-align:center'>Good Evening</h1>");
       else
    	   pw.println("<h1 style='color:black; text-align:center'>Good Night</h1>");
		
       pw.println("<br><br><a href=https://localhost:3030/WishMessageApp/HomePage.html><h3 style='text-align:center'>Home</h3></a>");
       pw.close();
	}
	

}
