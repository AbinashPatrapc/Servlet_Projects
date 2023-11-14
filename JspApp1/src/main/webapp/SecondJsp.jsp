<%@page import="java.util.Date"%>
<%! int x=20; %>
<%  int x=40; %>

<%= x %><br>
<%= this.x %>


<br>
<br>
<br>



<%! public String findBig(int a, int b){
	 if(a<b)
		 return a+" is Less than "+ b;
	 else if(a<b)
		 return b+" is Greater than "+a;
	 else
		 return a+","+b+" are Equal";
	 } %>
	 
<%=findBig(34,70)%>	 


<br>
<br>
<br>


<% int P=10;
   int Q=20;
 out.println("P is less Than Q "+(P<Q));  
 %>
<br>
<br>
<br>
<%=new java.util.Date() %><br>
<%= request.getHeader("user-agent") %>>


