package cftopic.model;

import java.util.ArrayList;
import java.util.List;

import cfpost.model.Post;

public class Topic {
	
	String subject;
	List<Post> posts = new ArrayList<Post>();
	int id;
	
	public Topic(String subject) {
		
		this.subject = subject;
	
	}
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public List<Post> getPosts() {
		return posts;
	}



	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	

	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	


}