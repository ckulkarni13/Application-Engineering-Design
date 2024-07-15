package model;

import constants.Role;
import enterprise.auth.Auth;
import java.util.ArrayList;
import java.util.List;
import model.researcher.Researcher;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author drag
 */
public class User {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String phone;
	private Role role;
	private List<ShortlistContainer> shortlist;			// only for hiring manager roles
	private boolean enabled;

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public User(String firstName, String lastName, String email, String password, String phone, Role role) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = Auth.getEncryptedPassword(password);
		this.phone = phone;
		this.role = role;
		this.shortlist = new ArrayList<>();
		this.enabled = true;
	}

	public List<ShortlistContainer> getShortlist() {
		if (this.role != Role.HIRING_MANAGER) return null;

		return shortlist;
	}

	public void setShortlist(List<ShortlistContainer> shortlist) {
		this.shortlist = shortlist;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}

	public void addToShortlist(Researcher r, String c) {
		this.shortlist.add(new ShortlistContainer(r,c));
	}

	public void removeFromShortlist (Researcher r) {
		ShortlistContainer tmp = null;
		for (ShortlistContainer s : this.shortlist) {
			if (s.getResearcher()==r) tmp = s;
		}
		this.shortlist.remove(tmp);
	}

	public boolean isShortlisted (Researcher r) {
		for (ShortlistContainer s: this.shortlist) {
			if (s.getResearcher() == r)return true;
		}
		return false;
	}

}
