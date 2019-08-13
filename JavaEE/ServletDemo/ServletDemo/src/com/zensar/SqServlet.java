package com.zensar;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.swing.internal.plaf.metal.resources.metal;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int c = (int) req.getAttribute("c");
		int square = c*c;
		resp.getWriter().println("Square is "+ square);
	}
}
