package classforum.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.*;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cfforum.model.ForumClass;
import cfpost.model.Post;
import cftopic.model.Topic;


@WebServlet("/DisplayTopics")
public class DisplayTopics extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DisplayTopics() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// use forumindex display topics that belong to the current forum we're working with
		
		int forumindex = Integer.parseInt(request.getParameter("forumIndex"));
			
		request.getRequestDispatcher( "/WEB-INF/DisplayTopics.jsp" )
        .forward( request, response );
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
