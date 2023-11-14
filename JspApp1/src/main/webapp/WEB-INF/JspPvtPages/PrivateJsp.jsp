 <h1 style='color:red; text-align:center'><b>WELCOME TO JSP PAGE</b></h1>
 <%= new java.util.Date() %>
 <br>
 <br>
<%@page buffer="1kb" autoFlush="true" %>

  <% 
  for(int i=1;i<=10;++i){
	  out.print("Raja"+i+"<br>");
  }
  
  
  %>
<br>
<br>
<%@page buffer="1kb" autoFlush="false" %>

  <% 
  for(int i=1;i<=20;++i){
	  if(i%10==0)
		  out.flush();
	  out.print("Raja"+i+"<br>");
  }
  %>

