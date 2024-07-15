/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.professor;

import helper.Helper;
import java.util.Date;
import java.util.List;
import model.UniClass;
import model.student.Student;

/**
 *
 * @author drag
 */
public class Term {
	private final String uuid;
	private List<UniClass> classes;
	private Date start;
	private Date end;
	private List<Student> enrolledStudents;

	public Term() {
		this.uuid = Helper.generateUUID();
	}

	public List<UniClass> getClasses() {
		return classes;
	}

	public void setClasses(List<UniClass> classes) {
		this.classes = classes;
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

	public List<Student> getEnrolledStudents() {
		return enrolledStudents;
	}

	public void setEnrolledStudents(List<Student> enrolledStudents) {
		this.enrolledStudents = enrolledStudents;
	}

	@Override
	public String toString() {
		return "Term{"
		    + "uuid='" + uuid + '\''
		    + ", classes=" + classes
		    + ", start=" + start
		    + ", end=" + end
		    + ", enrolledStudents=" + enrolledStudents
		    + '}';
	}
	
}
