/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package directory;

import constants.PaperStatus;
import java.util.ArrayList;
import java.util.List;
import model.researcher.Grant;
import model.researcher.ResearchGroup;
import model.researcher.ResearchPaper;
import model.researcher.Researcher;

/**
 *
 * @author drag
 */
public class ResearchGroupDirectory {

	private List<ResearchGroup> researchGroupDir;

	public List<ResearchGroup> getDir() {
		return researchGroupDir;
	}

	public void setResearchGroupDir(List<ResearchGroup> researchGroupDir) {
		this.researchGroupDir = researchGroupDir;
	}

	public ResearchGroupDirectory() {
		this.researchGroupDir = new ArrayList<>();
	}

	public ResearchGroup getById(String groupId) {
		for (ResearchGroup g : this.researchGroupDir) {
			if (g.getUuid().equals(groupId)) {
				return g;
			}
		}
		return null;
	}

	public List<ResearchGroup> getDirByResearcher(Researcher r) {
		List<ResearchGroup> res = new ArrayList<>();

		for (ResearchGroup g : this.researchGroupDir) {
			if (g.getGroup().contains(r)) {
				res.add(g);
			}
		}
		return res;
	}

	public List<ResearchGroup> getDir(PaperStatus status) {
		List<ResearchGroup> res = new ArrayList<>();

		for (ResearchGroup g : this.researchGroupDir) {
			if (g.getPaper().getStatus() == status) {
				res.add(g);
			}
		}

		return res;
	}

	public void createGroup(String creatorEmail, List<Researcher> group) {
		ResearchGroup rg = new ResearchGroup(creatorEmail);
		for (Researcher r : group) {
			rg.addMember(r);
		}

		this.researchGroupDir.add(rg);
	}

	public List<ResearchPaper> getPublishedPaperByResearcher(Researcher r) {
		List<ResearchPaper> papers = new ArrayList<>();

		for (ResearchGroup rg : this.researchGroupDir) {
			if (rg.getGroup().contains(r) && rg.getPaper().getStatus() == PaperStatus.PUBLISHED) {
				papers.add(rg.getPaper());
			}
		}

		return papers;
	}

	public List<ResearchPaper> getOngoingPaperByResearcher(Researcher r) {
		List<ResearchPaper> papers = new ArrayList<>();

		for (ResearchGroup rg : this.researchGroupDir) {
			if (rg.getGroup().contains(r)
			    && (rg.getPaper().getStatus() == PaperStatus.CHANGES_REQUESTED
			    || rg.getPaper().getStatus() == PaperStatus.DRAFT
			    || rg.getPaper().getStatus() == PaperStatus.UNDER_REVIEW)) {
				papers.add(rg.getPaper());
			}
		}

		return papers;
	}

	public List<ResearchPaper> getPaperByResearcher(Researcher r) {
		List<ResearchPaper> papers = new ArrayList<>();

		for (ResearchGroup rg : this.researchGroupDir) {
			if (rg.getGroup().contains(r)) {
				papers.add(rg.getPaper());
			}
		}

		return papers;
	}

	public ResearchGroup getPaperByResearcherAndTitle(Researcher r, String paperTitle) {

		for (ResearchGroup rg : this.researchGroupDir) {
			if (rg.getGroup().contains(r) && rg.getPaper().getTitle().equals(paperTitle)) {
				return rg;
			}
		}

		return null;
	}

	public Grant getGrantById(String grantId) {
		for (ResearchGroup rg : this.researchGroupDir) {
			for (Grant g : rg.getGrants()) {
				if (g.getUuid().equals(grantId)) return g;
			}
		}
		return null;
	}

	public int getTotalPapers() {
		return this.researchGroupDir.size();
	}

	public int getOngoingPapers() {
		int ongoing = 0;

		for (var paper : this.researchGroupDir) {
			if (paper.getPaper().getStatus() != PaperStatus.PUBLISHED) ongoing++;
		}
		return ongoing;
	}

	public int getPublishedPapers() {
		int published = 0;

		for (var paper: this.researchGroupDir) {
			if (paper.getPaper().getStatus() == PaperStatus.PUBLISHED) published++;
		}
		return published;
	}

}
