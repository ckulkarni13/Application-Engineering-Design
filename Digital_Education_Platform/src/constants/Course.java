/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package constants;

/**
 *
 * @author drag
 */
public enum Course {
	
	/**
	 *
	 */
	COURSE_5100(Speciality.INFO, "Application Engineering and Development"),
	COURSE_5010(Speciality.CS, "Program Design and Paradigms"),
	COURSE_5800(Speciality.CS, "Algorithms"),
	COURSE_6105(Speciality.INFO, "Data Science Engineering Methods and Tools"),
	COURSE_6106(Speciality.INFO, "Neural Modeling Methods and Tools"),
	COURSE_6205(Speciality.INFO, "Program Structure and Algorithms"),
	COURSE_6350(Speciality.INFO, "Smartphones-Based Web Development"),
	COURSE_6710(Speciality.CS, "Wireless Network"),
	COURSE_6500(Speciality.CS, "Computer Systems"),
	COURSE_5500(Speciality.CS, "Foundations of Software Engineering"),
	COURSE_7810(Speciality.CS, "Foundations of Cryptography"),
	COURSE_6410(Speciality.CS, "Compilers"),
	COURSE_6150(Speciality.INFO, "Web Design and UX Engineering"),
	COURSE_5000(Speciality.SES, "Object Oriented Design"),
	COURSE_5520(Speciality.CS, "Mobile Application Development");

	private final Speciality speciality;
	private final String courseName;

	Course(Speciality speciality, String courseName) {
		this.speciality = speciality;
		this.courseName = courseName;
	}

	public Speciality getSpeciality() {
		return speciality;
	}

	public String getName() {
		return courseName;
	}


}
