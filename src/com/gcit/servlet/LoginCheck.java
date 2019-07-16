package com.gcit.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gcit.dto.User;

/**
 * Servlet implementation class LoginCheck
 */
@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCheck() {
        super();
        // TODO Auto-generated constructor stub

        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stubpas
	    ArrayList<User> users = new ArrayList();

        users.add(new User("user1", "password1"));
        users.add(new User("user2", "password2"));
        users.add(new User("user3", "password3"));
        users.add(new User("user4", "password4"));
        users.add(new User("user5", "password5"));

		String uname = request.getParameter("uname");
		String password = request.getParameter("password");
		boolean found = false;
		for(int i = 0; i < users.size(); i ++) {
			//if(uname.equals(users.get(i).getName()) && password.equals(users.get(i).getPassword())) { //change 
			if(users.get(i).getName().equals(uname) && users.get(i).getPassword().equals(password)) {
				found = true;
			}
			else {
			}	
		}
		if(found == true) {
			response.sendRedirect("Member.jsp");
		}
		else {
			response.sendRedirect("error.jsp");
		}
//		String uname = request.getParameter("uname");
//		String password = request.getParameter("password");
//		if("bob".equals(uname) && password.equals("Smith")) { //change 
//			response.sendRedirect("Member.jsp");
//		}
//		else {
//			response.sendRedirect("error.jsp");
//		}
		//doGet(request, response);

		//doGet(request, response);
	}

}
