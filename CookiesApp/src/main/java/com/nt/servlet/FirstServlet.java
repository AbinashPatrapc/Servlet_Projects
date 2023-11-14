package com.nt.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class FirstServlet extends HttpServlet { 
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Cookie ck1=new Cookie("Odisha", "Bhubaneswar");
		Cookie ck2=new Cookie("TelanganaState", "Hyderabad");
		res.addCookie(ck1);res.addCookie(ck2);
		
		Cookie ck3=new Cookie("Karnataka","Bengaluru");
		Cookie ck4=new Cookie("Maharastra","Mumbai");
		ck3.setMaxAge(2*60);ck4.setMaxAge(2*60);
		res.addCookie(ck4);res.addCookie(ck4);
		
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("<h1 style=color:'red' text-align:'center'>Cookies Created and Added to the Browser");
		pw.close();
	
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

}
