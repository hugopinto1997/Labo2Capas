package com.uca.capas.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AnotacionServlet
 */
@WebServlet(urlPatterns="/AnotacionServlet", name="AnotacionServlet")
public class AnotacionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnotacionServlet() {
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
		String usuario = request.getParameter("user");
		String password = request.getParameter("password");
		PrintWriter salida = response.getWriter();
		salida.println("<html>");
		if(usuario.equals("hugo") && password.equals("root")) {
			salida.println("<body bgcolor='#5cb85c'>");
			salida.println("<h1 style='color:#fff; font-family:sans-serif;'>Bienvenido "+usuario+"!"+"</h1>");
		}else {
			salida.println("<body bgcolor='#d9534f'>");
			salida.println("<h1 style='color:#fff; font-family:sans-serif;'>La estas CAGANDO!</h1>");
			//salida.println("<h1>"+usuario+"</h1>"+"<h1>"+password+"</h1>");
		}
		salida.println("</body>");
		salida.println("</html>");


		//doGet(request, response);
	}

}
