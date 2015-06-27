package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class Myservlet
 */
@WebServlet("/Myservlet")
public class Myservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Myservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");  
		PrintWriter pw=response.getWriter();  
		  
		String name=request.getParameter("email");//will return value  
		pw.println("Please Login and try again.....");  
		  
		pw.close();  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");  
		PrintWriter pw=response.getWriter();  
	    
		String name=request.getParameter("name");//will return value  
		String password=request.getParameter("password");//will return value
		if(password.equals("smila@123") && name.equals("kaliaperumal2002@gmail.com")){

		    request.getRequestDispatcher("header.jsp").include(request, response);
		    pw.println("<br/><br/><br/><br/>");		    
		    request.getRequestDispatcher("Usersarticlelist.jsp").include(request, response);
		    
		    pw.println("Welcome LOGIN:: "+name);  
			HttpSession session1=request.getSession();  
	        session1.setAttribute("name",name);
	        session1.setAttribute("password",password);

		}else{
			pw.print("Sorry, username or password error!");  
            request.getRequestDispatcher("index.jsp").include(request, response);  
		}
		  
		pw.close();  
	}

}
