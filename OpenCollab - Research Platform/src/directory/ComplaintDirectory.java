/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package directory;

import java.util.ArrayList;
import java.util.List;
import model.Complaint;
import model.User;

/**
 *
 * @author drag
 */
public class ComplaintDirectory {
	List<Complaint> dir;

	public List<Complaint> getDir() {
		return dir;
	}

	public void setDir(List<Complaint> dir) {
		this.dir = dir;
	}

	public ComplaintDirectory() {
		this.dir = new ArrayList<>();
	}

	public void addComplaint(Complaint c) {
		this.dir.add(c);
	}

	public Complaint fetchById(String id) {
		for (Complaint c: this.dir) {
			if (c.getId().equals(id)) return c;
		}
		return null;
	}

	public List<Complaint> getDirByUser(User u) {
		List<Complaint> res = new ArrayList<>();

		for (Complaint c : this.dir){
			if (c.getUser()==u) res.add(c);
		}
		return res;
	}

}
