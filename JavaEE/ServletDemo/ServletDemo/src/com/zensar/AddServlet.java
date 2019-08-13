package com.zensar;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		System.out.println("Add");
		int a,b,c;
		a= Integer.parseInt(request.getParameter("num1"));
		b= Integer.parseInt(request.getParameter("num2"));
		c=a+b;
		
		
		RequestDispatcher rDispatcher = request.getRequestDispatcher("sq");
		request.setAttribute("c", c);
		rDispatcher.forward(request, response);
		
		
		
		
		
	}

}
