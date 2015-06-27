package com.servlet;
    import java.io.IOException;  
import java.io.PrintWriter;  

import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;  


    public class ProfileServlet extends HttpServlet {  
        /**
		 * @author kaliaperumal
		 * 
		 */
		private static final long serialVersionUID = 1L;

		protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                          throws ServletException, IOException {  
            response.setContentType("text/html");  
            PrintWriter out=response.getWriter();  
            request.getRequestDispatcher("link.jsp").include(request, response);  
              
            HttpSession session1=request.getSession(false);  
            if(session1.getAttribute("name") != null){  
            String name=(String)session1.getAttribute("name");  
            out.print("Hello, "+name+" Welcome to Profile");  
            }  
            else{  
                out.print("<h1 style='color:red'>"+"Please login first!!!!!</h1>");  
                request.getRequestDispatcher("index.jsp").include(request, response);  
            }  
            out.close();  
        }  
    }  