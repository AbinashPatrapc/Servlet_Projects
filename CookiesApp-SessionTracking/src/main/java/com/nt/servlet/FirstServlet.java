package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/firsturl")
public class FirstServlet extends HttpServlet {
 
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
	String name=req.getParameter("pname");	
	String fname=req.getParameter("fname");	
	String ms=req.getParameter("ms");
	Cookie ck1=new Cookie("name",name);
	Cookie ck2=new Cookie("fname",fname);
	Cookie ck3=new Cookie("ms",ms);
	res.addCookie(ck1);
	res.addCookie(ck2);
	res.addCookie(ck3);
	if(ms.equalsIgnoreCase("single")) {
		pw.println("<form action='secondurl' method='POST'>");
		pw.println("<table border='2' align='center' bgcolor='yellow'>");
		pw.println("<tr><td>When Do You Want To Merry ?</td>");
		pw.println("<td><input type='text' name='f1v1'></td></tr>");
		pw.println("<tr><td>Why Do You Want To Merry ?</td>");
		pw.println("<td><input type='text' name='f1v2'></td></tr>");
		pw.println("<tr><td colspan='2' align='center'><input type='submit' value='submit'></td></tr>");
		pw.println("</table>");
		
		pw.println("</form>");
	}else {
		pw.println("<form action='secondurl' method='POST'>");
		pw.println("<table border='2' align='center' bgcolor='yellow'>");
		pw.println("<tr><td>Enter Your Spouse Name :</td>");
		pw.println("<td><input type='text' name='f1v1'></td></tr>");
		pw.println("<tr><td>How Many Children You Have ?</td>");
		pw.println("<td><input type='text' name='f1v2'></td></tr>");
		pw.println("<tr><td colspan='2' align='center'><input type='submit' value='submit'></td></tr>");
		pw.println("</table>");
		
		pw.println("</form>");
	}
	pw.close();	
		
	}

	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

}
