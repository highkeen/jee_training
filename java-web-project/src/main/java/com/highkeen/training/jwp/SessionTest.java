package com.highkeen.training.jwp;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionTest
 */
public class SessionTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Optional<HttpSession> session=Optional
				.ofNullable(request.getSession(false));
		
		String data=
				session.map(s->s.getAttribute("data"))
				.map(Object::toString)
				.orElse("Session not created yet");
		
		String name=
				session.map(s->s.getAttribute("abc"))
				.map(Object::toString)
				.orElse("Session not created yet");
		
		response.getWriter().append("<h1>")
		.append(data)
		.append("</h1>")
		.append("<h1>")
		.append(name)
		.append("</h1>");
		
		Cookie cookie=new Cookie("_cookie1", "123132");
		Cookie cookie1=new Cookie("sessionId", session.map(HttpSession::getId).orElse(""));
		
		
		response.addCookie(cookie);;
		response.addCookie(cookie1);
	}

}
