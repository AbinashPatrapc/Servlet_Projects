<%! public static int sum(int x,int y){
	  return x+y;	
}

public static int square(int m){
	  return m*m;	
}

public static int cube(int m){
	  return m*m*m;	
}
%>


    The sum is:<%=sum(30,40) %><br>
    The Square is:<%=square(20) %><br>
    The Cube is:<%=square(10) %><br>
  <br>  
  <br>  
  <br>  
    
 <%=request.getClass() %><br>
 <%=out.getClass() %><br>
 <%=session.getClass() %><br>