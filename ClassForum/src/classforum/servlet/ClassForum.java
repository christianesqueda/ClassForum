package classforum.servlet;

import java.io.IOException;
import java.util.ArrayList;

import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cfforum.model.ForumClass;

@WebServlet(urlPatterns="/ClassForum", loadOnStartup=1)
public class ClassForum extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ClassForum() {
        super();
    }
    
    public void init(ServletConfig config) throws ServletException{
    	super.init(config);
    	
    	// initiate 2 default forums
    	
    	List<ForumClass> forums = new ArrayList<ForumClass>();		  	
    	ForumClass forum1 = new ForumClass("Web Programming", 0);
    	ForumClass forum2 = new ForumClass("General Discussion", 1);

    	forums.add(forum1);
    	forums.add(forum2);
 
    	getServletContext().setAttribute("forums", forums);
    	getServletContext().setAttribute("forum1", forum1);
    	getServletContext().setAttribute("forum2", forum2);

    	
    	
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


					
		request.getRequestDispatcher( "/WEB-INF/DisplayForums.jsp" )
        .forward( request, response );
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
