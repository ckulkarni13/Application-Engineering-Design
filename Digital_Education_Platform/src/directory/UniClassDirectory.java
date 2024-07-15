/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package directory;

import constants.Course;
import constants.Grade;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.ClassTiming;
import model.UniClass;
import model.professor.Professor;
import model.student.Student;

/**
 *
 * @author drag
 */
public class UniClassDirectory {

	private List<UniClass> directory;

	public UniClassDirectory() {
		this.directory = new ArrayList<>();
	}

	public List<UniClass> getDirectory() {
		return this.directory;
	}
		
	public List<UniClass> getUniClassByRegion(String query) {	
		List<UniClass> res = new ArrayList<>();

		for (UniClass uc : this.getDirectory()) {
			if (uc.getProfessor().getRegion().equalsIgnoreCase(query)) res.add(uc);
		}

		return res;
	}

	public List<UniClass> getUniClassByLanguage(String query) {	
		List<UniClass> res = new ArrayList<>();

		for (UniClass uc : this.getDirectory()) {
			if (uc.getProfessor().getLanguage().equalsIgnoreCase(query)) res.add(uc);
		}

		return res;
	}
		
	public List<UniClass> getUniClassByName(String query) {	
		List<UniClass> res = new ArrayList<>();

		for (UniClass uc : this.getDirectory()) {
			String firstName = uc.getProfessor().getUserProfile().getPerson().getFirstName();
			String lastName = uc.getProfessor().getUserProfile().getPerson().getLastName();
			if (firstName.equalsIgnoreCase(query) || 
			    lastName.equalsIgnoreCase(query) || 
			    firstName.contains(query) ||
				lastName.contains(query)) res.add(uc);
		}

		return res;

	}

	public void inheritData(ProfessorDirectory profDir) {
		var dir = profDir.getDirectory();
		for (int i = 0; i < dir.size(); ++i) {
			int coursesN = 2;

			if (i == 0 || i == 3) {
				this.directory.add(new UniClass(Course.COURSE_5800, new ClassTiming("3pm-6pm"), dir.get(i), "first"));
				this.directory.add(new UniClass(Course.COURSE_5100, new ClassTiming("10:30am-1pm"), dir.get(i), "second"));
			} else if (i == 1 || i == 5) {
				this.directory.add(new UniClass(Course.COURSE_5010, new ClassTiming("3pm-6pm"), dir.get(i), "first"));
				this.directory.add(new UniClass(Course.COURSE_6150, new ClassTiming("10:30am-1pm"), dir.get(i), "second"));
			} else if (i == 2 || i == 4) {
				this.directory.add(new UniClass(Course.COURSE_6205, new ClassTiming("3pm-6pm"), dir.get(i), "first"));
				this.directory.add(new UniClass(Course.COURSE_7810, new ClassTiming("10:30am-1pm"), dir.get(i), "second"));
			} else if (i == 6 || i == 7) {
				this.directory.add(new UniClass(Course.COURSE_6105, new ClassTiming("3pm-6pm"), dir.get(i), "first"));
				this.directory.add(new UniClass(Course.COURSE_5520, new ClassTiming("10:30am-1pm"), dir.get(i), "second"));
			} else if (i == 8 || i == 9) {
				this.directory.add(new UniClass(Course.COURSE_6350, new ClassTiming("3pm-6pm"), dir.get(i), "first"));
				this.directory.add(new UniClass(Course.COURSE_5500, new ClassTiming("10:30am-1pm"), dir.get(i), "second"));
			} else {
				this.directory.add(new UniClass(Course.COURSE_6205, new ClassTiming("3pm-6pm"), dir.get(i), "first"));
				this.directory.add(new UniClass(Course.COURSE_7810, new ClassTiming("10:30am-1pm"), dir.get(i), "second"));
			}
		}

//		int counter = 0;
//		for (int i = 0; i < dir.size(); ++i) {
//
//			if (counter >= getRandomCourses().size()-1) {
//				counter = 0;
//			}
//			else {
//				counter++;
//			}
//			Course course1 = getRandomCourses().get(counter);
//			Course course2 = getRandomCourses().get((counter + 1) % getRandomCourses().size());
//
//			// Create UniClass objects for the courses and assign them to the professor
//			UniClass uniClass1 = new UniClass(course1, new ClassTiming(getRandomTimeSlot(getRandomTimeSlots())), dir.get(i), "first");
//			UniClass uniClass2 = new UniClass(course2, new ClassTiming(getRandomTimeSlot(getRandomTimeSlots())), dir.get(i), "second");
//
////			if (!availableCourses.isEmpty()) {
////				Course course1 = availableCourses.remove(0);
////				String timeSlot1 = getRandomTimeSlot(availableTimeSlots);
////				this.directory.add(new UniClass(course1, new ClassTiming(timeSlot1), dir.get(i), "first"));
////			}
////			if (!availableCourses.isEmpty()) {
////				Course course2 = availableCourses.remove(0);
////				String timeSlot2 = getRandomTimeSlot(availableTimeSlots);
////				this.directory.add(new UniClass(course2, new ClassTiming(timeSlot2), dir.get(i), "second"));
////			}
//System.out.println(dir.get(i));
//			this.directory.add(uniClass1);
//			this.directory.add(uniClass2);
//		}
	}

	private List<Course> getRandomCourses() {
		List<Course> courses = new ArrayList<>(List.of(
		    Course.COURSE_5100, Course.COURSE_5010, Course.COURSE_5800,
		    Course.COURSE_6105, Course.COURSE_6106, Course.COURSE_6205,
		    Course.COURSE_6350, Course.COURSE_6710, Course.COURSE_6500,
		    Course.COURSE_5500, Course.COURSE_7810, Course.COURSE_6410,
		    Course.COURSE_6150, Course.COURSE_5000, Course.COURSE_5520
		));

		Collections.shuffle(courses);
		return courses;
	}

	private List<String> getRandomTimeSlots() {
		List<String> timeSlots = new ArrayList<>(List.of(
		    "8am-11am", "9am-12pm", "10am-1pm", "11am-2pm", "12pm-3pm"
		));

		Collections.shuffle(timeSlots);
		return timeSlots;
	}

	private String getRandomTimeSlot(List<String> availableTimeSlots) {
		if (!availableTimeSlots.isEmpty()) {
			return availableTimeSlots.remove(0);
		} else {
			// Handle the case where there are no more available time slots
			// You can repeat time slots or handle it as needed for your application
			return "10am-12pm";
		}
	}

	public UniClass addClass(UniClass uniClass) {
		try {
			this.directory.add(uniClass);
			return uniClass;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public Map<UniClass, Integer> getClassStudentData(Professor p, List<UniClass> classes) {
		Map<UniClass, Integer> data = new HashMap<>();

		for (UniClass uc : classes) {

		}
		return data;

	}

	public List<UniClass> getProfClasses(Professor p) {
		List<UniClass> res = new ArrayList<>();
		for (UniClass u : this.directory) {
			if (u.getProfessor() == p) {
				res.add(u);
			}
		}
		return res;
	}

	public void removeClass(UniClass uc) {
		this.directory.remove(uc);
	}

	public void _displayClasses() {
		for (var a : this.directory) {
//			System.out.println(a.getFullCourseName() + " >>> " + a.getProfessor().getUserProfile().getPerson().getFirstName());
		}
//		System.out.println("<><><><><><><><>");
	}

	public UniClass getUniClassByProf(Professor p, Course c) {
		for (UniClass uc : this.directory) {
			if (uc.getCourse().equals(c) && uc.getProfessor() == p) {
				return uc;
			}
		}
		return null;
	}

	public List<UniClass> getProfThatTeach(String query) {
		List<UniClass> res = new ArrayList<>();

		String uniClassName = query.split(":")[1].trim();
		for (var uniClass : this.getDirectory()) {
			if (uniClass.getCourse().getName().equals(uniClassName)) {
				res.add(uniClass);
			}
		}

		return res;
	}

	public UniClass getUniClassById(String uuid) {
		for (UniClass uc : this.directory) {
			if (uc.getUuid().equals(uuid)) {
				return uc;
			}
		}
		return null;
	}

}
