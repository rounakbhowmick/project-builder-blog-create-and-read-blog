package model;

import java.sql.Date;

public class Blog {
	public Blog(String blogTitle, String blogDescription, Date date) {
		this.blogTitle = blogTitle;
		this.blogDescription = blogDescription;
		this.postedOn = date;
	}

	String blogTitle;
	String blogDescription;
	Date postedOn;

	public String getBlogTitle() {
		return blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	public String getBlogDescription() {
		return blogDescription;
	}

	public void setBlogDescription(String blogDescription) {
		this.blogDescription = blogDescription;
	}

	public Date getPostedOn() {
		return postedOn;
	}

	public void setPostedOn(Date postedOn) {
		this.postedOn = postedOn;
	}
}