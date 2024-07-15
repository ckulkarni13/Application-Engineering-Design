/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.employer;

import model.User;
import model.professor.Professor;
import model.student.Student;

/**
 *
 * @author drag
 */
public class EmployerRating {
	private float rating;	
	private String comments;
	private User employer;			// which employer has given it

	public EmployerRating(float rating, String comments, User employer) {
		this.rating = rating;
		this.comments = comments;
		this.employer = employer;
	}

	public User getEmployer() {
		return employer;
	}

	public void setEmployer(User employer) {
		this.employer = employer;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
}
