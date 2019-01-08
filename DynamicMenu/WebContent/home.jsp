<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page import="java.util.List" %>
  <%@ page import="menubar.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	List<MenuItem> menuList = MenuBarDAO.getMenuList();
%>

	<nav>
		<ul>
			<%
				for (MenuItem m : menuList) 
				{
			%>
	
			<li><a href="<%=m.getMenuItemLink()%>"><%=m.getMenuItemName()%></a></li>
	
			<%
				}
			%>
	
		</ul>
	</nav>

</body>
</html>