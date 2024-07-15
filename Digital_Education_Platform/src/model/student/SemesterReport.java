/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.student;

import constants.Grade;
import helper.Helper;
import java.util.HashMap;
import java.util.Map;
import model.UniClass;
import model.transcript.Transcript;

/**
 *
 * @author drag
 */
public class SemesterReport {

	private String uuid;
	private int serialNum;
	private boolean isCurrent;
	private float gpa;
	private Map<UniClass, Grade> classes;

	public SemesterReport(int serialNum) {
		this.uuid = Helper.generateUUID();
		this.classes = new HashMap<>();
		this.isCurrent = true;
		this.serialNum = serialNum;

//		System.out.println(this);
	}

	public void addClass(UniClass uc, Grade grade) {
		this.classes.put(uc, grade);
	}

	public void dropClass(UniClass uc) {
		this.classes.remove(uc);
	}

	public void markClassComplete(UniClass uc) {
		this.classes.put(uc, Grade.YET_TO_GRADE);
	}

	public int getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}

	public boolean isCurrent() {
		return isCurrent;
	}

	public void setIsCurrent(boolean isCurrent) {
		this.isCurrent = isCurrent;
	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	public Map<UniClass, Grade> getClasses() {
		return classes;
	}

	public String toString() {
		return "SemesterReport{"
		    + "uuid='" + uuid + '\''
		    + ", serialNum=" + serialNum
		    + ", isCurrent=" + isCurrent
		    + ", gpa=" + gpa
		    + ", classes=" + classes
		    + '}';
	}

}
