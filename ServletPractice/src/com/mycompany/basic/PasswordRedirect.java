package com.mycompany.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mycompany.validate.CredentialValidate;

/**
 * Servlet implementation class PasswordRedirect
 */

public class PasswordRedirect extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PasswordRedirect() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		System.out.println("PasswordRedirect doget(-,-) mehtod");
		CredentialValidate credentialValidate = new CredentialValidate();		
		HttpSession session = request.getSession();		
		String password = request.getParameter("password");
		String userName = request.getParameter("userName");
		System.out.println("userName ===" + userName);
		boolean flag = credentialValidate.validate("p", password);
		if (flag) {			
			response.sendRedirect("Password.jsp");
			
		} else {
			RequestDispatcher rd = request
					.getRequestDispatcher("/errorPage.jsp");
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

}
