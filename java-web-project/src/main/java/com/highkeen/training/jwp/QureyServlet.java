package com.highkeen.training.jwp;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class QureyServlet
 */
@WebServlet("/QureyServlet.do")
public class QureyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private List<String> colours=Arrays.asList("red","green","blue");
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QureyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getHeaderNames().asIterator()
		.forEachRemaining(x -> System.out.println(x+ " = "+request.getHeader(x)));
		
		List<String> tcolurs=null;
		String q=request.getParameter("co");
		
		if(q != null) {
			int index=colours.indexOf(q);
			tcolurs=index !=-1 ? Arrays.asList(colours.get(index)):Collections.emptyList();
		}
		else {
			tcolurs=colours;
		}
				
		response.getWriter().append(buildResponse(tcolurs));
		
	}
	
	
	private String buildResponse(List<String> colours) {
		if(colours.isEmpty()) {
			return "<h1>No data found</h1>";
		}
		else {
			return colours.stream()
					.map(c-> "<h1 style='color:"+c+"'>"+c+"</h1>" )
					.collect(Collectors.joining("\n"));
		}
	}
	
	

}
