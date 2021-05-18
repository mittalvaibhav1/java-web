package com.JspApp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/demo")
public class DemoServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		req.setAttribute("num1", Integer.parseInt(req.getParameter("num1")));
		req.setAttribute("num2", Integer.parseInt(req.getParameter("num2")));
		String name = "Ash Ketchum";
		req.setAttribute("name", name);
		RequestDispatcher rd = req.getRequestDispatcher("add.jsp");
		rd.forward(req, res);
	}
		
}
