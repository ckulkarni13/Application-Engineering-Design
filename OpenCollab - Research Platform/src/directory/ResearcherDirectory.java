/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package directory;

import java.util.ArrayList;
import java.util.List;
import model.User;
import model.researcher.Researcher;

/**
 *
 * @author drag
 */
public class ResearcherDirectory {

	private List<Researcher> researcherDir;

	public List<Researcher> getResearcherDir() {
		return researcherDir;
	}

	public ResearcherDirectory() {
		this.researcherDir = new ArrayList<>();
	}

	public void setResearcherDir(List<Researcher> researcherDir) {
		this.researcherDir = researcherDir;
	}

	public Researcher fetchByEmail(String e) {
		for (Researcher r : this.researcherDir) {
			if (e.equals(r.getUser().getEmail())) {
				return r;
			}
		}
		return null;
	}

	public Researcher fetchByUser(User u) {
		for (Researcher r : this.researcherDir) {
			if (r.getUser() == u) {
				return r;
			}
		}
		return null;
	}

	public void addResearcher(Researcher r) {
		this.researcherDir.add(r);
	}

	public List<Researcher> fetchByQuery(String query) {
		List<Researcher> res = new ArrayList<>();

		for (Researcher r: this.researcherDir) {
			if (r.getUser().getFirstName().contains(query) || r.getUser().getLastName().contains(query)) {
				res.add(r);
			}
		}

		return res;
	}

	public Researcher getById(String email) {
		for (Researcher r: this.researcherDir) {
			if (r.getUser().getEmail().equals(email)) return r;
		}
		return null;
	}

}
