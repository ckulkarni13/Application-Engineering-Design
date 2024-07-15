/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package directory;

import constants.Grade;
import constants.Role;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.UniClass;
import model.User;
import model.student.Student;
import model.transcript.Transcript;

/**
 *
 * @author drag
 */
public class StudentDirectory {

	private List<Student> directory;

	public StudentDirectory() {
		this.directory = new ArrayList<>();
	}

	public void inheritData(UserDirectory userDir) {
		for (User u : userDir.getDirectory()) {
			if (u.getRole() == Role.STUDENT) {
				// Creating sample students 
				Transcript transcript = new Transcript();

				// add semester dummy data
				directory.add(new Student(u, transcript));
			}
		}
	}

	public List<Student> getDirectory() {
		return directory;
	}

	public void addSampleClasses(UniClassDirectory uniClassDir) {
		List<UniClass> classes = uniClassDir.getDirectory();
		Collections.shuffle(classes);

		for (Student student : this.getDirectory()) {
			List<UniClass> classesToAdd = new ArrayList<>();

			// Randomly select and add up to two university classes
			for (int i = 0; i < 2 && !classes.isEmpty(); i++) {
				UniClass selectedClass = classes.remove(0);
				classesToAdd.add(selectedClass);
				student.getTranscript().getCurrentSemester().addClass(selectedClass, Grade.YET_TO_COMPLETE);
			}

		}

	}

	public List<Student> getRequestedForGraduation() {
		List<Student> res = new ArrayList<>();

		for (Student s : this.getDirectory()) {
			if (s.hasRequestedForGraduation() && !s.isGraduated()) {
				res.add(s);
			}
		}
		return res;
	}

	public List<Student> getStudentsByUniClass(UniClass uc) {
		List<Student> res = new ArrayList<>();

		for (Student s : this.directory) {
			if (s.getTranscript().getAllClasses().containsKey(uc)) {
				res.add(s);
			}
		}

		return res;
	}

	public List<Student> getStudentsByUniClass(UniClass uc, boolean completed) {
		List<Student> res = new ArrayList<>();

		for (Student s : this.directory) {
			if (s.getTranscript().getAllClasses().containsKey(uc)) {
				res.add(s);
			}
		}

		return res;
	}

	public void updateStudent(Student student) {
		for (Student s : this.directory) {
			if (student == s) {
				s = student;
			}
		}
	}

	public void updateStudentTranscript(Student student) {
		for (Student s : this.directory) {
			if (student == s) {
//				s = student;

//				s.setTranscript(student.getTranscript());
			}
		}
	}

	public Student getStudent(User user) {
		for (Student s : this.directory) {
			if (s.getUserProfile() == user) {
				return s;
			}
		}
		return null;
	}

	public Student getStudentById(String uuid) {
		for (Student s : this.directory) {
			if (s.getUuid().equals(uuid)) {
				return s;
			}
		}
		return null;
	}

	public boolean addStudent(Student s) {
		if (s.getUserProfile().getRole() != Role.STUDENT) {
			return false;
		}

		return true;
	}

}
