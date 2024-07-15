/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import enterprise.auth.Auth;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author drag
 */
public class Email {
	private String subject;
	private String message;
	private String senderEmail;
	private String date;
	private String id;

	public SimpleDateFormat getDateFormat() {
		return dateFormat;
	}

	public String getSenderEmail() {
		return senderEmail;
	}

	private final SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yy HH:mm:ss");

	public String getId() {
		return id;
	}

	public Email(String senderEmail) {
		this.id = Auth.generateUUID();
		this.senderEmail = senderEmail;
		this.date = dateFormat.format(new Date());
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	
}
