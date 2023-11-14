package com.nt.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LinksServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw=res.getWriter();
		
		res.setContentType("text/html");
		
		String p1val=req.getParameter("p1");
		
		Locale locales[]=Locale.getAvailableLocales();
	     
		if(p1val.equalsIgnoreCase("link1")){
			pw.println("<h2>List Of All the Country</h2>");
			for(Locale l:locales) {
				pw.println(l.getDisplayCountry()+",");
			}
		}
		else if(p1val.equalsIgnoreCase("link2")) {
			pw.println("<h2>List Of All the Language</h2>");
			for(Locale l:locales) {
				pw.println(l.getDisplayLanguage()+",");
			}	
		}
		else {
			pw.println("<h2>System Properties</h2>");
			pw.println(System.getProperties());
		}
	  
		pw.println("<br> <a href='links.html'><b>Home</b></a>");
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}
	

}
