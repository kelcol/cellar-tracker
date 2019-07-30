package com.kelcol.cellartracker.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestDBServletWine
 */
@WebServlet("/TestDBServletWine")
public class TestDBServletWine extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String user = "testuser";
		String pass = "testuser";
		String jdbcUrl = "jdbc:mysql://localhost:3306/wine_tracker?useSSL=false";
		String driver = "org.mariadb.jdbc.Driver";

		// Get conn to db
		try {
			
			PrintWriter out = response.getWriter();
			
			out.println("connecting to database..." + jdbcUrl);
			
			Class.forName(driver);

			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);

			System.out.println("Connection successful!!!");
			
			myConn.close();

		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}

	}

}
