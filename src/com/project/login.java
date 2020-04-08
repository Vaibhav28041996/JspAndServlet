package com.project;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.dao.loginDao;

@WebServlet("/login")
public class login extends HttpServlet {
	
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
		
		{
			loginDao dao=new loginDao();
			
			String username=request.getParameter("uname");
			String password=request.getParameter("pwd");
			HttpSession session=request.getSession();//session is limited to current browser
			
			session.setAttribute("username", username);
			if(dao.check(username, password))
			{
				response.sendRedirect("welcome.jsp");
			}
			else
			{
				response.sendRedirect("login.jsp");
			}
		}
}
