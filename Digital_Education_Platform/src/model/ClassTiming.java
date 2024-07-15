/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author drag
 */
public class ClassTiming {
	private final String start;
	private final String end;

	public ClassTiming(String time) {
		String[] _split = time.split("-");
		this.start = _split[0];	
		this.end = _split[1];	

	}

	public String getStart() {
		return start;
	}

	public String getEnd() {
		return end;
	}

	@Override
	public String toString() {
		return "ClassTiming [start=" + start + ", end=" + end + "]";
	}
	
	
}
