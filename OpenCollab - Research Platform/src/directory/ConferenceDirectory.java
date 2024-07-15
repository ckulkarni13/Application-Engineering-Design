/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package directory;

import java.util.ArrayList;
import java.util.List;
import model.scrutiny.Conference;

/**
 *
 * @author drag
 */
public class ConferenceDirectory {
	List<Conference> dir;

	public ConferenceDirectory() {
		this.dir = new ArrayList<>();
	}

	public List<Conference> getDir() {
		return dir;
	}

	public Conference fetchById(String id) {
		for (Conference conf: this.dir) {
			if (conf.getId().equals(id)) {
				return conf;
			}
		}
		return null;

	}

}
