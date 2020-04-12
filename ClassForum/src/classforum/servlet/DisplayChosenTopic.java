package classforum.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cfforum.model.ForumClass;
import cfpost.model.Post;
import cftopic.model.Topic;


@WebServlet("/DisplayChosenTopic")
public class DisplayChosenTopic extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    
    public DisplayChosenTopic() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//use indexDCT to identify the topic we're working with
		
		int indexDCT = Integer.parseInt(request.getParameter("indexDCT"));

		
		Date today;
		String result;
		SimpleDateFormat formatter;
		
		formatter = new SimpleDateFormat("M/d/y h:ma");
		today = new Date();
		result = formatter.format(today);
		
		
		request.getRequestDispatcher( "/WEB-INF/DisplayChosenTopiccf.jsp" )
        .forward( request, response );
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// retrieve form name and content and create new post and save under the topic we're working with
		
		String name = request.getParameter("name");
		String content = request.getParameter("content");

		Post post = new Post(name, content);
		int forumindex2 = Integer.parseInt(request.getParameter("forumIndex2"));
		int indexDCT = Integer.parseInt(request.getParameter("indexDCT"));
		List<ForumClass> forums = (List<ForumClass>) getServletContext().getAttribute("forums");
		
		Date today;
		String result;
		SimpleDateFormat formatter;
		
		formatter = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
		today = new Date();
		String dateString = formatter.format(today);
		
		post.setTimeStamp(dateString);
		
		forums.get(forumindex2).getTopics().get(indexDCT).getPosts().add(post);
		
		request.getRequestDispatcher( "/WEB-INF/ReturnChosenTopiccf.jsp" )
        .forward( request, response );

	}

}