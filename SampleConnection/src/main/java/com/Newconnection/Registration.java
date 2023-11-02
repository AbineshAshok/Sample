package com.Newconnection;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class Registration
 */
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String email = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
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
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String repassword = request.getParameter("Repassword");
		String mobile = request.getParameter("mobile");
		

		
		Login login = new Login(name, email, password, repassword, mobile);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection   con =DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
         		
	 PreparedStatement pst=con.prepareStatement("Insert into Invite(Name,Email,Password,Repet_Password,Mobile_Number)values(?,?,?,?,?)");
		  
		 pst.setString(1, name);
		 pst.setString(2, email);
		 pst.setString(3, password);
		 pst.setString(4, password);
		 pst.setString(5, mobile);

		  
		int msg=   pst.executeUpdate();
		
		 
		   if(msg >0) {
			   response.sendRedirect("Index.jsp");
		   }
		   else {
			   response.sendRedirect("Register.jsp");
		   }
			
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
			

		
		}
	}

	


}
