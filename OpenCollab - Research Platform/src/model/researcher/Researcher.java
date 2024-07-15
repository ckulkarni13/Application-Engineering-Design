/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.researcher;

import enterprise.auth.Auth;
import java.util.ArrayList;
import java.util.List;
import model.User;
import model.Email;
import model.scrutiny.Conference;

/**
 *
 * @author drag
 */
public class Researcher {

	private User user;
	private List<ResearchPaper> publishedPapers;
	private int citationCount;
	private float hIndex;
	private List<Conference> confs;
	private List<Email> emails;
	private String uuid;

	public Researcher() {
		confs = new ArrayList<>();
		emails = new ArrayList<>();
		uuid = Auth.generateUUID();
	}

	public String getUuid() {
		return uuid;
	}

	public List<Conference> getConfs() {
		return confs;
	}

	public List<Email> getEmails() {
		return emails;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<ResearchPaper> getPublishedPapers() {
		return publishedPapers;
	}

	public void setPublishedPapers(List<ResearchPaper> publishedPapers) {
		this.publishedPapers = publishedPapers;
	}

	public int getCitationCount() {
		return citationCount;
	}

	public void setCitationCount(int citationCount) {
		this.citationCount = citationCount;
	}

	public float gethIndex() {
		return hIndex;
	}

	public void sethIndex(float hIndex) {
		this.hIndex = hIndex;
	}

	public void addConference(Conference conf) {
		this.confs.add(conf);
	}

	public void removeConference(Conference conf) {
		this.confs.remove(conf);
	}

	public void addEmail(Email email) {
		this.emails.add(email);
	}

	public boolean hasAttendedConference(Conference conf) {
		return this.confs.contains(conf);
	}

	public Email getEmailById(String emailId) {
		for (Email e: this.emails) {
			if (emailId.equals(e.getId())) return e;
		}
		return null;
	}
}
