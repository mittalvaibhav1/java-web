package com.ServletApp;

import java.io.PrintWriter;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i + j;
		
//		Request Dispatcher
//		req.setAttribute("k", k);
//		RequestDispatcher rd = req.getRequestDispatcher("/sq");
//		rd.forward(req, res);
		
//		Redirect
		res.sendRedirect("sq?k="+k);
		
//		PrintWriter out = res.getWriter();
//		out.println("The result is: " + k);
	}
}
