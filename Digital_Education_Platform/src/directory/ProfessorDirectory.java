/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package directory;

import constants.Role;
import java.util.ArrayList;
import java.util.List;
import model.User;
import model.professor.Professor;

/**
 *
 * @author drag
 */
public class ProfessorDirectory {

	private List<Professor> directory;

	public ProfessorDirectory() {
		this.directory = new ArrayList<>();
	}

	public List<Professor> getDirectory() {
		return directory;
	}

	public void inheritData(UserDirectory userDir) {
		for (User u : userDir.getDirectory()) {
			if (u.getRole() == Role.PROFESSOR) {
				directory.add(new Professor(u));
			}
		}
	}
	
	
	public Professor getProfessor(String uuid) {
		for (Professor p:this.getDirectory()) {
			if (p.getUuid().equals(uuid)) return p;
		}
		return null;
	}

	public boolean addProfessor(Professor prof) {
		if (prof.getUserProfile().getRole() != Role.PROFESSOR) {
			return false;
		}

		return true;
	}

	public Professor getProfessor(User user) {
		for (Professor p : this.directory) {
			if (p.getUserProfile() == user) {
				return p;
			}
		}
		return null;
	}
}
