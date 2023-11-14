//DateServlet.java
package com.nt.servlet;

import jakarta.servlet.*;//Servlet Api
import java.io.*;//IO Streams
import java.util.*;//Utility api(For date class)



public class DateServlet extends GenericServlet {
   
     public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException {
       //get Printwriter stream from response obj 
		PrintWriter pw=res.getWriter();
        //set response content type to instruct the browser to display in certain type
		res.setContentType("text/html");

        //Bussiness Logic
        Date dt=new Date();
        //write b.logic result to response obj using printwriter stream
		pw.println("<h1 style=color:green;text-align:center>Date and Time is::"+dt+"</h1>");
        //closing the printwriter stream
		pw.close();

     }
}