/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package directory;

import java.util.ArrayList;
import java.util.List;
import model.researcher.ResearchPaper;

/**
 *
 * @author drag
 */
public class ResearchPaperDirectory {
	private List<ResearchPaper> paperDir;

	public ResearchPaperDirectory() {
		this.paperDir = new ArrayList<>();
	}

	public List<ResearchPaper> getDir() {
		return paperDir;
	}

	public void setPaperDir(List<ResearchPaper> paperDir) {
		this.paperDir = paperDir;
	}

	public ResearchPaper findByTitle(String paperTitle) {
		for (ResearchPaper p : this.paperDir) {
			if (p.equals(paperTitle)) {
				return p;
			}
		}
		return null;
	}


}
