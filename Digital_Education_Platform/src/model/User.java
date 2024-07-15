package model;

import constants.Role;
import helper.Helper;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author drag
 */
public class User {

	private String uuid;
	private String userName;
	private String password;
	private boolean enabled;
	private Person person;
	private Role role;

	public User(String userName, String password, boolean enabled, Person p, Role role) {
		this.uuid = Helper.generateUUID();

		this.userName = userName;
		this.password = Helper.getEncryptedPassword(password);
		this.enabled = enabled;
		this.person = p;
		this.role = role;

	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User{"
		    + "uuid='" + uuid + '\''
		    + ", userName='" + userName + '\''
		    + ", password='" + password + '\''
		    + ", enabled=" + enabled
		    + ", person=" + person
		    + ", role=" + role
		    + '}';
	}

}
