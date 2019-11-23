package com.mycompany.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String name = null;
	private String company = null;
	private String Global_companyName = null;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HelloWorld() {
		super();
		System.out.println("control is in constructor ");
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("control is in service(-,-) method ");
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("welcome to helloworld servlet <br>");
		pw.println("servlet config parameters are init params <br>");
		pw.println("Name = " + name + "company = " + company + "<br>");
		pw.println("Global companyName = " + Global_companyName );

	}

	public void init(ServletConfig servletConfig) throws ServletException {
		System.out.println("control is in init(-) method ");
		this.name = servletConfig.getInitParameter("name");
		this.company = servletConfig.getInitParameter("company");
		ServletContext context = servletConfig.getServletContext();
		this.Global_companyName = context.getInitParameter("Global companyName");
	}

}
