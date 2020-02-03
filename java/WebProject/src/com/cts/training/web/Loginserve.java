package com.cts.training.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Loginserve
 */
@WebServlet("/Loginserve")
public class Loginserve extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Loginserve() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name=request.getParameter("name");
		String pass=request.getParameter("pass");
		
		request.setAttribute("username", name.toUpperCase());
		request.setAttribute("pass", pass.concat("Check"));
		
 		HttpSession session =  request.getSession();
		session.setAttribute("username", name.toUpperCase());
		session.setAttribute("pass", pass.concat("Check"));

		ServletContext context =  this.getServletContext();
		context.setAttribute("username", name.toUpperCase());
		context.setAttribute("pass", pass.concat("Check"));

		//PrintWriter writer=response.getWriter();
		
        if(name.equals("sahil")&& pass.equals("sahil"))
        {
        	/*
        	writer.write("<h1>Welcome</h1>");
        	*/
        	
        	/*
        	response.sendRedirect("welcome.html");
        	*/
			this.getServletContext().getRequestDispatcher("welcome.jsp").forward(request, response);

			}
        else {
        	/*
        	writer.write("<h1>Invalid</h1>");
        	*/
        	
        	/*
        	response.sendRedirect("error.html");
        	*/
			this.getServletContext().getRequestDispatcher("error.html").forward(request, response);

        }
      }
	
}
