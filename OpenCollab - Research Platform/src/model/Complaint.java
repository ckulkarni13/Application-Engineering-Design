/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import enterprise.auth.Auth;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author drag
 */
public class Complaint {
	private String title;
	private String mainIssue;
	private String howToReproduce;
	private String date;
	private String adminResponse;
	private String id;
	private User user;

	private final SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yy HH:mm:ss");

	public Complaint() {
		this.title="";
		this.mainIssue="";
		this.howToReproduce="";
		this.adminResponse="NOT_YET_REPLIED";
		this.date = dateFormat.format(new Date());
		this.id=Auth.generateUUID();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMainIssue() {
		return mainIssue;
	}

	public void setMainIssue(String mainIssue) {
		this.mainIssue = mainIssue;
	}

	public String getHowToReproduce() {
		return howToReproduce;
	}

	public void setHowToReproduce(String howToReproduce) {
		this.howToReproduce = howToReproduce;
	}

	public String getAdminResponse() {
		return adminResponse;
	}

	public void setAdminResponse(String adminResponse) {
		this.adminResponse = adminResponse;
	}



}
