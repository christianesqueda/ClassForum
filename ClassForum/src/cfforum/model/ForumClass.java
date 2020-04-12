package cfforum.model;

import java.util.ArrayList;
import java.util.List;

import cftopic.model.Topic;

public class ForumClass {
	int id;
	List<Topic> topics = new ArrayList<Topic>();
	String forumName;
	
	public ForumClass(String forumName, int id) {
		this.forumName = forumName;
		this.id = id;
	}
	
	public String getForumName() {
		return forumName;
	}
	public void setForumName(String forumName) {
		this.forumName = forumName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Topic> getTopics() {
		return topics;
	}
	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}
	

}