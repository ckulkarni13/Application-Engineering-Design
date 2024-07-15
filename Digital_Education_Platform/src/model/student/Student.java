/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.student;

import constants.Grade;
import constants.Speciality;
import helper.Helper;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import model.Notification;
import model.UniClass;
import model.User;
import model.employer.EmployerRating;
import model.transcript.Transcript;

/**
 *
 * @author drag
 */
public class Student {

	private String uuid;
	private Transcript transcript;    //  
	private User userProfile;       // done
	private Speciality course;
	private boolean graduated;
	private List<Student> history;
	private List<Notification> notifications;
	private List<EmployerRating> employerRatings;
	private boolean requestedForGraduation;

	public Student(User userProfile, Transcript transcript) {
		this.uuid = Helper.generateUUID();
		this.userProfile = userProfile;
		this.graduated = false;
		this.transcript = transcript;
		this.requestedForGraduation = false;
		this.employerRatings = new ArrayList<>();
		this.notifications = new ArrayList<>();
	}

	public float getAvgEmployerRating() {
		float total = 0;
		for (EmployerRating emRating:this.employerRatings) {
			total += emRating.getRating();
		}
		float res = total / this.employerRatings.size();
		return Float.isNaN(res) ? 0 : res;
	}

	public void makeSemesterCheck() {
		boolean flag = true;

		var currentSemClasses = this.getTranscript().getCurrentSemester().getClasses().entrySet();

		for (var classes : currentSemClasses) {
			var key = classes.getKey();
			var value = classes.getValue();

			if (value == Grade.YET_TO_GRADE || value == Grade.YET_TO_COMPLETE || value == Grade.I) {
				flag = false;    // means some class is pending
			}
		}

		if (flag && currentSemClasses.size() == 2) {   // all classes done 
			this.getTranscript().addSemester();

			currentSemClasses = this.getTranscript().getCurrentSemester().getClasses().entrySet();
		}

	}

	public EmployerRating getEmployerRating(User employer) {
		for (EmployerRating rating : this.getEmployerRatings()) {
			if (rating.getEmployer() == employer) {
				return rating;
			}
		}
		return null;
	}

	public void addEmployerRating(User employer, float rating, String comments) {
		boolean ratingExists = false;
		for (EmployerRating emRating : this.getEmployerRatings()) {
			if (emRating.getEmployer() == employer) { 			// means rating already exists - so just update it
				emRating.setComments(comments);
				emRating.setRating(rating);
				ratingExists = true;
			}
		}
		if (!ratingExists) {							// means rating does not already exist - so insert it
			this.employerRatings.add(new EmployerRating(rating, comments, employer));
		}
	}

	public void addNotification(Notification n) {
		if (!notifications.contains(n)) {
			this.notifications.add(n);
		}
	}

	public List<EmployerRating> getEmployerRatings() {
		return employerRatings;
	}

	public void setEmployerRatings(List<EmployerRating> employerRatings) {
		this.employerRatings = employerRatings;
	}

	public boolean hasRequestedForGraduation() {
		return this.requestedForGraduation;
	}

	public void setRequestedForGraduation(boolean requestedForGraduation) {
		this.requestedForGraduation = requestedForGraduation;
	}

	public boolean hasCompletedClass(UniClass uc) {
		boolean flag = true;

		for (Map.Entry<UniClass, Grade> entry : this.getTranscript().getAllClasses().entrySet()) {
			if (entry.getValue() == Grade.YET_TO_COMPLETE
			    || entry.getValue() == Grade.I) {
				flag = false;
			}
		}
		return flag;
	}

	public boolean hasTakenAlready(UniClass uc) {
		return this.getTranscript().getAllClasses().containsKey(uc);
	}

	public List<Notification> getNotifications() {
		return notifications;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Transcript getTranscript() {
		return transcript;
	}

	public void setTranscript(Transcript transcript) {
		this.transcript = transcript;
	}

	public User getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(User userProfile) {
		this.userProfile = userProfile;
	}

	public Speciality getCourse() {
		return course;
	}

	public void setCourse(Speciality course) {
		this.course = course;
	}

	public boolean isGraduated() {
		return graduated;
	}

	public void setGraduated(boolean graduated) {
		this.graduated = graduated;
	}

	public List<Student> getHistory() {
		return history;
	}

	public void setHistory(List<Student> history) {
		this.history = history;
	}

	@Override
	public String toString() {
		return "Student{"
		    + "uuid='" + uuid + '\''
		    + ", transcript=" + transcript
		    + ", userProfile=" + userProfile
		    + ", course=" + course
		    + ", graduated=" + graduated
		    + ", history=" + history
		    + ", notifications=" + notifications
		    + '}';
	}

}
