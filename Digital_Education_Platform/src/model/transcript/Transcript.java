/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.transcript;

import constants.Grade;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.UniClass;
import model.student.SemesterReport;

/**
 *
 * @author drag
 */
public class Transcript {

	private String uuid;
	private List<SemesterReport> semesters;
	private Date programStart;
	private Date programEnd;
	private float gpa;
	private boolean graduated;

	public Transcript() {
		this.programStart = new Date();
		this.semesters = new ArrayList<>();
		this.addSemester();     // add the first semester by default
		this.gpa = 0;
		this.graduated = false;
	}

	public void addSemester() {
		for (var s : this.semesters) {
			s.setIsCurrent(false);
		}
		int newSemSerial = this.semesters.size() + 1;
		this.semesters.add(new SemesterReport(newSemSerial));
	}

	public Map<UniClass, Grade> getAllClasses() {
		Map<UniClass, Grade> classes = new HashMap<>();

		for (SemesterReport sem : semesters) {
			for (Map.Entry<UniClass, Grade> entry : sem.getClasses().entrySet()) {
				UniClass key = entry.getKey();
				Grade value = entry.getValue();
				classes.put(key, value);
			}
		}
		return classes;
	}

	public void updateGrade(Transcript transcript, UniClass uc, Grade g) {
		var lectures = this.getCurrentSemester().getClasses();

		if (lectures.size() == 0) {
			this.displaySemesters();
			return;
		}
		this.getCurrentSemester().getClasses().put(uc, g);

		int completed = 0;

		for (var classes : this.getCurrentSemester().getClasses().entrySet()) {
			var value = classes.getValue();

			if (value == Grade.YET_TO_GRADE || value == Grade.YET_TO_COMPLETE || value == Grade.I) {
				break;
			} else {
				completed++;
			}
		}

		if (completed == 2) {                 // current semester completed successfully
			if (this.semesters.size() >= 4) {
				this.setGraduated(true);
				return;
			}

			float pointsTotal = 0;
			for (var uniClass : this.getAllClasses().entrySet()) {
				var grade = uniClass.getValue();
				pointsTotal += grade.getPoints();
			}
			System.out.println(pointsTotal);
			this.setGpa(pointsTotal / (2 * this.getCurrentSemester().getSerialNum()));    // subtracting by the semester offset i.e. 2

			this.addSemester();

		}
	}

	public void displaySemesters() {
		for (var a : this.getCurrentSemester().getClasses().entrySet()) {
			System.out.println("Name: " + a.getKey().getFullCourseName() + " | Grade: " + a.getValue() + " | Semester: " + this.getCurrentSemester().getSerialNum());
		}
		System.out.println();
	}

	public boolean isGraduated() {
		return graduated;
	}

	public void setGraduated(boolean graduated) {
		this.graduated = graduated;
	}

	public SemesterReport getCurrentSemester() {
		return this.semesters.get(this.semesters.size() - 1);
	}

	public List<SemesterReport> getSemesters() {
		return semesters;
	}

	public void setSemesters(List<SemesterReport> semesters) {
		this.semesters = semesters;
	}

	public Date getProgramStart() {
		return programStart;
	}

	public void setProgramStart(Date programStart) {
		this.programStart = programStart;
	}

	public Date getProgramEnd() {
		return programEnd;
	}

	public void setProgramEnd(Date programEnd) {
		this.programEnd = programEnd;
	}

	public float getGpa() {
		// iterate over the semesters and get grades for each course - as per calculate gpa
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Transcript{"
		    + "uuid='" + uuid + '\''
		    + ", semesters=" + semesters
		    + ", programStart=" + programStart
		    + ", programEnd=" + programEnd
		    + ", gpa=" + gpa
		    + '}';
	}

}
