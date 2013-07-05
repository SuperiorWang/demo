package com.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CheckAccount extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AccountBean account = new AccountBean();
		
		String username = request.getParameter("username");
		String age = request.getParameter("age");
		String password = request.getParameter("password");
		
		HttpSession session = request.getSession();
		
		System.out.println(username);
		System.out.println(age);
		System.out.println(password);
		
		if ((username != "") && (age != "") && (password != ""))
		{
			account.setUsername(username);
			account.setAge(age);
			account.setPassword(password);
			session.setAttribute("account", account);
			String logon_suc = "logonsuc.jsp";
			response.sendRedirect(logon_suc);
			return;
		}
			
		String login_fail = "fail.jsp";
		response.sendRedirect(login_fail);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
