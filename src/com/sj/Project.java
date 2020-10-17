package com.sj;

public class Project {

	int id;
	String title;
	String domain;
	String description;
	
	public Project(int id, String title, String domain, String description) {
		super();
		this.id = id;
		this.title = title;
		this.domain = domain;
		this.description = description;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", title=" + title + ", domain=" + domain + ", description=" + description + "]";
	}

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getDomain() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
