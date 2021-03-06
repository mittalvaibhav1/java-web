package com.ServletApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int k = 0;
		Cookie[] cookies = req.getCookies();
		for(Cookie c : cookies) {
			if(c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
			}
		}
		// Contexts are shared by all the servlets!
		// Config is unique for each servlet
//		ServletContext ctx = getServletContext();
		ServletConfig cg = getServletConfig();
		String str = cg.getInitParameter("Name");
		PrintWriter out = res.getWriter();
		out.println(str + " is SQ");
		out.println();
	}
}
