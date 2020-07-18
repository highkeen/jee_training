package com.highkeen.training.jwp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormSubmit
 */
@WebServlet("/FormSubmit.do")
public class FormSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String data=request.getParameter("field1");
		
		
			
		out.append("<html>")
		.append("<head>")
		.append("</head>")
		.append("<body>")
		.append("<h1>Form</h1>")
		.append("<form method='post'>")
		.append("<input name='field1' value='"+(data==null?"":data)+"'>")
		.append("</form>");
		
		if(data!=null) {
			out.append("<h3>You enter : "+data+"</h3>");
		}
		
		out.append("</body>")
		.append("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		
	}

}
