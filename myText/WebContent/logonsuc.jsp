<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>Insert title here</title>
</head>
<body>

<%
com.web.servlet.AccountBean account = (com.web.servlet.AccountBean)session.getAttribute("account");
%>

username:<%=account.getUsername() %>
<br/>
age:<%=account.getAge() %>
<br/>
password:<%=account.getPassword() %>
<br/>

</body>
</html>