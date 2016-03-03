package com.vis.gp.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * Servlet implementation class ServerServlet
 */
@WebServlet("/ServerServlet")
public class ServerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String host="jdbc:mysql://localhost:3306/obd2-db", username="root", pswd="";
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
		/*String uname = request.getParameter("asd");
		String pass = request.getParameter("asds");
		//System.out.println(request.toString());
		//System.out.println(request.getParameterNames().toString());
		response.getWriter().println("Validating user with username = "+uname+" and password = "+pass);
		System.out.println(uname);
		System.out.println(pass);
		/*if( ValidateUser(uname, pass) == 1)
			response.getWriter().append("User Found.");
		else
			response.getWriter().append("Unable to find user.");*/
	}

	
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

	}
	*/
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	  {
	    StringBuffer sb = new StringBuffer();
	 
	    try 
	    {
	      BufferedReader reader = request.getReader();
	      String line = null;
	      while ((line = reader.readLine()) != null)
	      {
	        sb.append(line);
	      }
	    } catch (Exception e) { e.printStackTrace(); }
	    System.out.println(sb.toString());
	    
	    JSONParser parser = new JSONParser();
	    JSONObject joUser = null;
	    try {
			joUser = (JSONObject) parser.parse(sb.toString());
		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	    String user = (String) joUser.get("mail");
	    String pass = (String) joUser.get("pass");
	    response.setContentType("text/html");
	    System.out.println("A new user " + user + " has been created with password " + pass);
	    int checkUser = ValidateUser(user,pass);
	    PrintWriter out = response.getWriter();
	    if(checkUser == 1){
		    out.write("123123123");
		    out.flush();
		    out.close();
	    }
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
