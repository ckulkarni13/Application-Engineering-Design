/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import constants.Course;
import helper.Helper;
import java.util.Date;
import model.professor.Professor;

/**
 *
 * @author drag
 */
public class UniClass {

	private String uuid;
	private Course course;
	private Date start;
	private Date end;
	private ClassTiming timing;
	private Professor professor;
	private String serial;                  // could be first or second (a professor only property)
	private int semesterSerialNum;		// (student only property)
	private int numberOfStudents;		// exclusive to students only

	public UniClass(Course course, ClassTiming timing, Professor professor) {
		this.uuid = Helper.generateUUID().substring(0, 7);
		this.course = course;
		this.timing = timing;
		this.professor = professor;
		this.serial = "";
		this.numberOfStudents = 0;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public String getSerial() {
		return serial;
	}

	public int getSemesterSerialNum() {
		return semesterSerialNum;
	}

	public void setSemesterSerialNum(int semesterSerialNum) {
		this.semesterSerialNum = semesterSerialNum;
	}

	public UniClass(Course course, ClassTiming timing, Professor professor, String serial) {
		this.uuid = Helper.generateUUID().substring(0, 7);
		this.course = course;
		this.timing = timing;
		this.professor = professor;
		this.serial = serial;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public ClassTiming getTiming() {
		return timing;
	}

	public void setTiming(ClassTiming timing) {
		this.timing = timing;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public String getFullCourseName() {
		return this.getCourse().getSpeciality() + " : " + this.getCourse().getName();
	}

	@Override
	public String toString() {
		return "UniClass{"
		    + "uuid='" + uuid + '\''
		    + ", course=" + course
		    + ", start=" + start
		    + ", end=" + end
		    + ", timing=" + timing
		    + '}';
	}

}
