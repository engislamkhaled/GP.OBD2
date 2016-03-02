package com.vis.gp.Server;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServerServlet
 */
@WebServlet("/ServerServlet")
public class ServerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String host="jdbc:mysql://localhost:3306/obd-gp-dev-1", username="root", pswd="12345678";
	private static Connection con;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String uname = request.getParameter("username");
		String pass = request.getParameter("password");
		response.getWriter().println("Validating user with username = "+uname+" and password = "+pass);
		if( ValidateUser(uname, pass) == 1)
			response.getWriter().append("User Found.");
		else
			response.getWriter().append("Unable to find user.");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
	
	
	
	public static int ValidateUser(String name, String pass)
	{
		Connection con;
		int status=0;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
		
		try {
			con = DriverManager.getConnection(host, username, pswd);
			Statement st = con.createStatement();
			String query = "select user_id from users where user_name = '"+name+"' and user_password = '"+pass+"'";
			ResultSet res = st.executeQuery(query);
			if (!res.next())
			{
				status=-1;
				System.out.println("User Does not exist.");
			}
			else
			{
				status=1;
				System.out.println("User Exists.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}


}
