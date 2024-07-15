/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.researcher;

import java.util.Date;
import java.text.SimpleDateFormat;
import model.User;

/**
 *
 * @author drag
 */
public class VersionControl {

	private String latestChange;
	private User user;
	private final SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yy HH:mm:ss");
	private String comments;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public VersionControl(User u, String comments) {
		this.latestChange = dateFormat.format(new Date());
		this.user = u;
		this.comments=comments;
	}

	public String getLatestChange() {
		return latestChange;
	}

	public void setLatestChange(String latestChange) {
		this.latestChange = latestChange;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}



}
