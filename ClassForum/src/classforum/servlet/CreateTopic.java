package classforum.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cfforum.model.ForumClass;
import cfpost.model.Post;
import cftopic.model.Topic;;


@WebServlet("/CreateTopic")
public class CreateTopic extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public CreateTopic() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// retrieve forum index parameter to identify the forum we're working with
		
		int forumindex2 = Integer.parseInt(request.getParameter("forumIndex2"));
		
		
		request.getRequestDispatcher( "/WEB-INF/CreateTopiccf.jsp" )
        .forward( request, response );
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//request parameters from form and create new post and add to the new topic
		//add new topic to the forum indicated by forumIndex
		
		int forumindex2 = Integer.parseInt(request.getParameter("forumIndex2"));	
		String name = request.getParameter("name");
		String subject = request.getParameter("subject");
		String content = request.getParameter("content");	
		
		Topic topic = new Topic(subject);	
		List<ForumClass> forums = (List<ForumClass>) getServletContext().getAttribute("forums");	
		Post post = new Post(name, content);
		
		Date today;
		SimpleDateFormat formatter;		
		formatter = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
		today = new Date();
		String dateString = formatter.format(today);
		
		post.setTimeStamp(dateString);
						
		topic.getPosts().add(post);
		forums.get(forumindex2).getTopics().add(topic);
		
		request.getRequestDispatcher( "/WEB-INF/Returncf.jsp" )
        .forward( request, response );

		
		

		
		
	}




}
