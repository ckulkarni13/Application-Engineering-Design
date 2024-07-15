/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package directory;

import constants.Role;
import enterprise.auth.Auth;
import java.util.ArrayList;
import java.util.List;
import model.User;

/**
 *
 * @author drag
 */
public class UserDirectory {
	private List<User> userDir;

	public UserDirectory() {
		this.userDir = new ArrayList<>();
	}

	public List<User> getUserDir() {
		return userDir;
	}

	public User login(String email, String password) {
		for (User u: userDir) {
			if (u.getEmail().equals(email) && Auth.checkPassword(password, u.getPassword())) {
				return u;
			}
		}
		return null;
	}

	public void setUserDir(List<User> userDir) {
		this.userDir = userDir;
	}

	public void addUser(User u) {
		this.userDir.add(u);
	}

	public List<User> getRecruiters() {
		List<User> res = new ArrayList<>();

		for (var user : this.userDir) {
			if (user.getRole() == Role.HIRING_MANAGER) res.add(user);
		}
		return res;
	}

	public int getTotalResearchers() {
		int total = 0;

		for (var user : this.userDir) {
			if (user.getRole() == Role.RESEARCHER) total++;
		}
		return total;
	}

	public int getTotalFeedbackUsers() {
		int total = 0;

		for (var user : this.userDir) {
			if (user.getRole() == Role.FEEDBACK_USER) total++;
		}
		return total;
	}

	public User fetchByEmail(String email){
		for (var user : this.userDir) {
			if (user.getEmail().equals(email)) return user;
		}
		return null;
	}

}
