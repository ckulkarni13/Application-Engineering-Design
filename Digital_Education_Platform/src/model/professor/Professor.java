/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.professor;

import constants.Speciality;
import helper.Helper;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import model.User;
import model.employer.EmployerRating;

/**
 *
 * @author drag
 */
public class Professor {
	private String uuid;
	private Speciality speciality;
	private Term termSchedule;
	private User userProfile;
	private List<Professor> history;
	private String region;
	private String language;
	private float studentRating;
	private List<EmployerRating> employerRatings;


	private static final List<String> allregions = new ArrayList<>();
	private static final List<String> languages = new ArrayList<>();

	static {
		allregions.add("USA");
		allregions.add("Canada");
		allregions.add("UK");
		allregions.add("Australia");
		allregions.add("Germany");
		allregions.add("France");
		allregions.add("Japan");
		allregions.add("Brazil");
		allregions.add("India");
		allregions.add("South Africa");
		allregions.add("Mexico");
	}
	static {
		languages.add("English");
		languages.add("Spanish");
		languages.add("French");
		languages.add("German");
		languages.add("Chinese (Mandarin)");
		languages.add("Russian");
		languages.add("Arabic");
		languages.add("Japanese");
		languages.add("Portuguese");
		languages.add("Hindi");
		languages.add("Italian");
	}

	public Professor(User userProfile) {
		this.uuid = Helper.generateUUID();
		this.userProfile = userProfile;
		this.employerRatings = new ArrayList<>();
		this.region = getRandomRegion();
		this.language = getRandomLanguage();
	}

	private String getRandomRegion() {
		Random random = new Random();
		int randomIndex = random.nextInt(allregions.size());
		return allregions.get(randomIndex);
	}
	
	private String getRandomLanguage() {
		Random random = new Random();
		int randomIndex = random.nextInt(languages.size());
		return languages.get(randomIndex);
	}		

	public Professor() {
		this.uuid = Helper.generateUUID();
	}

	public float getAvgEmployerRating() {
		float total = 0;
		for (EmployerRating emRating:this.employerRatings) {
			total += emRating.getRating();
		}
		float res = total / this.employerRatings.size();
		return Float.isNaN(res) ? 0 : res;
	}

	public EmployerRating getEmployerRating(User employer) {
		for (EmployerRating rating:this.getEmployerRatings()) {
			if (rating.getEmployer()==employer) return rating;
		}
		return null;
	}

	public void addEmployerRating(User employer, float rating, String comments) {
		boolean ratingExists = false;
		for (EmployerRating emRating: this.getEmployerRatings()) {
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

	public List<EmployerRating> getEmployerRatings() {
		return employerRatings;
	}

	public void setEmployerRatings(List<EmployerRating> employerRatings) {
		this.employerRatings = employerRatings;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Speciality getSpeciality() {
		return speciality;
	}

	public void setSpeciality(Speciality speciality) {
		this.speciality = speciality;
	}

	public Term getTermSchedule() {
		return termSchedule;
	}

	public void setTermSchedule(Term termSchedule) {
		this.termSchedule = termSchedule;
	}

	public User getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(User userProfile) {
		this.userProfile = userProfile;
	}

	public List<Professor> getHistory() {
		return history;
	}

	public void setHistory(List<Professor> history) {
		this.history = history;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public float getStudentRating() {
		return studentRating;
	}

	public void setStudentRating(float studentRating) {
		this.studentRating = studentRating;
	}

	@Override
	public String toString() {
		return "Professor{"
		    + "uuid='" + uuid + '\''
		    + ", speciality=" + speciality
		    + ", termSchedule=" + termSchedule
		    + ", userProfile=" + userProfile
		    + ", history=" + history
		    + ", region='" + region + '\''
		    + ", language='" + language + '\''
		    + ", studentRating=" + studentRating
		    + '}';
	}
}
