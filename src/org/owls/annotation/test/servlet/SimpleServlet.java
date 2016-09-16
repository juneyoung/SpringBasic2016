package org.owls.annotation.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
	urlPatterns={"/servlet"}
	, initParams = { 
		@WebInitParam(name="name", value="Test")
		, @WebInitParam(name="greeting", value="Hello")
	})
public class SimpleServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {

		String name = getInitParameter("name");
		String greeting = getInitParameter("greeting");
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head><title>Greetings</title></head>");
		out.println("<body>");
		out.println(greeting + ", " + name);
		out.println("</body></html>");
		out.flush();
	}
}
