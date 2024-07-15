/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.scrutiny;

import enterprise.auth.Auth;
import java.util.List;

/**
 *
 * @author drag
 */
public class Conference {
	private String title;
	private String date;
	private String venue;
	private List<String> tags;
	private String id;

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

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public Conference(String title, String date, String venue, List<String> tags) {
		this.id = Auth.generateUUID();
		this.title = title;
		this.date = date;
		this.venue = venue;
		this.tags = tags;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	


}
