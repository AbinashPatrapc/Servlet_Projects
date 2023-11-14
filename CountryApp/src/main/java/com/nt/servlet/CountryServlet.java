package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CountryServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	 		PrintWriter pw=res.getWriter();
	 		
	        res.setContentType("text/html");
	       
	        int countryCode=Integer.parseInt(req.getParameter("country"));
	        
	        String[] countryName=new String[] {"India","USA","United Kingdom","Canada","Sri Lanka","Germany","Japan","Thailand","Australia","West Indies","Brazil"};
	        String[] countryCapital=new String[] {"New Delhi","Washington DC","London","Ottawa","Colombo","Berlin","Tokyo","Bankok","Canberra","Chaguaramas","Brazilia"};
	        
	        pw.println("<h1 style='color:violet;text-align:center'>The Capital City Name of &nbsp" +countryName[countryCode]+ "&nbsp is: &nbsp" +countryCapital[countryCode] +"</h1>");
	        
	        pw.println("<a href='Input.html'><h4 style=text-align:center>Home</h4></a>");
	        
	        pw.close();
	
	
	
	
	}

}
