<%@ page import="java.util.*"  %>
<%@ page import="java.sql.*"  %>
<%
ResultSet result=(ResultSet)request.getAttribute("jsp");

while(result.next())
out.print("<br> "+result.getString(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getString(4));
%>