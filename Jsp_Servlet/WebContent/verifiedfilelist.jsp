
<%@page import="com.hibernate.Fetchactivatefilelist"%>
<jsp:useBean id="list" class="com.hibernate.Fetchactivatefilelist"></jsp:useBean>
<%
Fetchactivatefilelist ob1=new Fetchactivatefilelist();

ob1.getlist();

%>
