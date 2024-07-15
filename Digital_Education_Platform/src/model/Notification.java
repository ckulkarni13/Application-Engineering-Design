/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import helper.Helper;
import java.util.Date;
import model.professor.Professor;

/**
 *
 * @author drag
 */
public class Notification {

	private String uuid;
	private String createdOn;
	private UniClass uniClass;
	private boolean read;
	private String subject;
	private String message;

	public Notification(UniClass uniClass, String subject, String message) {
		this.uuid = Helper.generateUUID();
		this.createdOn = Helper.generateTimeStamp();
		this.uniClass = uniClass;
		this.subject = subject;
		this.message = message;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public UniClass getUniClass() {
		return uniClass;
	}

	public void setUniClass(UniClass uniClass) {
		this.uniClass = uniClass;
	}

	public boolean isRead() {
		return read;
	}

	public void setRead(boolean read) {
		this.read = read;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Notification{"
		    + "uuid='" + uuid + '\''
		    + ", subject=" + subject
		    + ", createdOn=" + createdOn
		    + ", uniClass=" + uniClass
		    + ", read=" + read
		    + ", message='" + message+ '\''
		    + '}';
	}

}
