package com.iu.s1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		  String contextPath = request.getContextPath();
		  String encoding = request.getCharacterEncoding();
		  String method = request.getMethod();
		  String pathInfo = request.getPathInfo();
		  String uri = request.getRequestURI();
		  StringBuffer url = request.getRequestURL();
		  String servletPath = request.getServletPath();
		  String name = request.getParameter("파라미터이름");
		  
		  System.out.println("ContextPath : "+contextPath);
		  System.out.println("Encoding : "+encoding);
		  System.out.println("Method : "+method);
		  System.out.println("PathInfo : "+pathInfo);
		  System.out.println("URI : "+uri);
		  System.out.println("URL : "+url.toString());
		  System.out.println("ServletPath : "+servletPath);
		
		
		
		String id = request.getParameter("id");
		String age = request.getParameter("age");
		
		System.out.println(id);
		System.out.println(age);
		
		RequestDispatcher view = request.getRequestDispatcher("./WEB-INF/index.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}