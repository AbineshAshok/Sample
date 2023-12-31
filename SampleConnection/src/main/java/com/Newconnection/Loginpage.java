package com.Newconnection;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.awt.JobAttributes;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Servlet implementation class Loginpage
 */
public class Loginpage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Loginpage() {
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
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String UserName = request.getParameter("cemail");
		String Password = request.getParameter("cpassword");
		
		HttpSession session =request.getSession();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection   con =DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?useSSL=false","root","root");
	         		
		 PreparedStatement pst=con.prepareStatement("select * from Invite where Email = ? and Password = ?");
			  
			 pst.setString(1, UserName);
			 pst.setString(2, Password);
			 
			 ResultSet rs  =pst.executeQuery();
			 
			 if(rs.next()) {
				 response.sendRedirect("Msg.jsp");
			 }
			 else {
				 
				 response.sendRedirect("Register.jsp");
			 }
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
