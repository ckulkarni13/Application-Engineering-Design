/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.researcher.Researcher;

/**
 *
 * @author drag
 */
public class ShortlistContainer {
	private Researcher researcher;
	private String comment;

	public Researcher getResearcher() {
		return researcher;
	}

	public void setResearcher(Researcher researcher) {
		this.researcher = researcher;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public ShortlistContainer(Researcher researcher, String comment) {
		this.researcher = researcher;
		this.comment = comment;
	}


}
