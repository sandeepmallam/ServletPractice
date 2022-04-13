package com.servlets;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 9211568140687018262L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("entered post");
		HttpSession session = req.getSession();
		session.setAttribute("username", req.getParameter("username"));
		session.setAttribute("password", req.getParameter("password"));
		resp.sendRedirect("/BasicLoginServlet/dashboard.jsp");
		
	}
}
