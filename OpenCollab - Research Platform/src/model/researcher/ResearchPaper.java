/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.researcher;

import constants.Domain;
import constants.PaperStatus;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import model.User;

/**
 *
 * @author drag
 */
public class ResearchPaper {
	private Date publishedDate;
	private List<Researcher> authors;
	private List<String> keywords;

	private String title;
	private String abstractText;
	private String results;
	private String intro;
	private String conclusion;
	private String filePath;
	private PaperStatus status;
	private Domain domain;
	private String doi;
	private List<VersionControl> history;
	private List<Researcher> citations;

	public List<VersionControl> getHistory() {
		return history;
	}

	public void setHistory(List<VersionControl> history) {
		this.history = history;
	}

	public void addHistory(User u, String c) {
		this.history.add(new VersionControl(u, c));
	} 

	public List<Researcher> getCitations() {
		return citations;
	}

	public void addCiteByResearcher(Researcher r) {
		this.citations.add(r);
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public ResearchPaper() {
		this.doi = "doi:" + UUID.randomUUID().toString();
		this.title = "Sample title";
		this.history = new ArrayList<>();
		this.status = PaperStatus.DRAFT;
		this.citations = new ArrayList();
	}

	public String getDoi() {
		return doi;
	}

	public String getResults() {
		return results;
	}

	public void setResults(String results) {
		this.results = results;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public void setDoi(String doi) {
		this.doi = doi;
	}

	public Domain getDomain() {
		return domain;
	}

	public void setDomain(Domain domain) {
		this.domain = domain;
	}

	public Date getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Researcher> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Researcher> authors) {
		this.authors = authors;
	}

	public List<String> getKeywords() {
		return keywords;
	}

	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}

	public String getAbstractText() {
		return abstractText;
	}

	public void setAbstractText(String abstractText) {
		this.abstractText = abstractText;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public PaperStatus getStatus() {
		return status;
	}

	public void setStatus(PaperStatus status) {
		this.status = status;
	}



}
