/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import constants.Role;
import directory.ComplaintDirectory;
import directory.ConferenceDirectory;
import directory.ResearchGroupDirectory;
import directory.ResearchPaperDirectory;
import directory.ResearcherDirectory;
import directory.UserDirectory;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.User;
import model.researcher.ResearchGroup;
import model.researcher.Researcher;
import model.scrutiny.Conference;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import model.researcher.ResearchPaper;
//import org.apache.pdfbox.pdmodel.PDDocument;
//import org.apache.pdfbox.pdmodel.PDPage;
//import org.apache.pdfbox.pdmodel.PDPageContentStream;
//import org.apache.pdfbox.pdmodel.font.PDType1Font;

/**
 *
 * @author drag
 */
public class Config {

	public static ResearcherDirectory initializeResearcherDir(UserDirectory ud) {
		ResearcherDirectory dir = new ResearcherDirectory();
		List<Researcher> researchers = new ArrayList<>();

		Researcher r = new Researcher();
		User u = new User("atharva", "kamble", "atharva@email.com", "password123", "8512004661", Role.RESEARCHER);
		r.setUser(u);
		r.setCitationCount(30);
		researchers.add(r);
		ud.getUserDir().add(u);

		r = new Researcher();
		u = new User("pranitee", "majukar", "pranitee@email.com", "password123", "8512004661", Role.RESEARCHER);
		r.setUser(u);
		r.setCitationCount(36);
		researchers.add(r);
		ud.getUserDir().add(u);

		r = new Researcher();
		u = new User("chinmay", "kulkarni", "chinmay@email.com", "password123", "8512004661", Role.RESEARCHER);
		r.setUser(u);
		r.setCitationCount(34);
		researchers.add(r);
		ud.getUserDir().add(u);

		r = new Researcher();
		u = new User("Emily", "Myers", "em", "a", "8512004661", Role.RESEARCHER);
		r.setUser(u);
		r.setCitationCount(34);
		researchers.add(r);
		ud.getUserDir().add(u);

		r = new Researcher();
		u = new User("Will", "Byers", "will", "a", "8512004661", Role.RESEARCHER);
		r.setUser(u);
		r.setCitationCount(18);
		researchers.add(r);
		ud.getUserDir().add(u);

		r = new Researcher();
		u = new User("Lee", "Wong", "lee", "a", "8512004661", Role.RESEARCHER);
		r.setUser(u);
		r.setCitationCount(10);
		researchers.add(r);
		ud.getUserDir().add(u);

		dir.setResearcherDir(researchers);
		return dir;
	}

	public static UserDirectory initializeUserDir() {
		UserDirectory dir = new UserDirectory();
		List<User> users = new ArrayList<>();

		User u = new User("John", "Doe", "john@email.com", "a", "8512004661", Role.FEEDBACK_USER);
		users.add(u);

		u = new User("Jane", "Doe", "jane@email.com", "a", "8512004661", Role.FEEDBACK_USER);
		users.add(u);

		u = new User("Jim", "Doe", "jim@email.com", "a", "8512004661", Role.FEEDBACK_USER);
		users.add(u);

		u = new User("admin", "admin", "admin@email.com", "password123", "8512004661", Role.ADMIN);
		users.add(u);

		u = new User("BCG", "", "bcg@email.com", "password123", "8512004661", Role.HIRING_MANAGER);
		users.add(u);

		u = new User("Microsoft", "", "microsoft@email.com", "password123", "8512004661", Role.HIRING_MANAGER);
		users.add(u);

		u = new User("Google", "", "google@email.com", "password123", "8512004661", Role.HIRING_MANAGER);
		users.add(u);

		// Scrutiny org
		u = new User("Scrutiny", "Association", "sru@email.com", "password123", "8512004661", Role.SCRUTINY_ASSCOCIATION);
		users.add(u);

		dir.setUserDir(users);
		return dir;
	}

	public static ResearchGroupDirectory initializeResearchGroupDir(ResearcherDirectory researchers) {
		ResearchGroupDirectory dir = new ResearchGroupDirectory();

		List<ResearchGroup> groups = new ArrayList<>();

		ResearchGroup rg = new ResearchGroup("atharva@email.com");

		rg.addMember(researchers.fetchByEmail("atharva@email.com"));
		rg.addMember(researchers.fetchByEmail("pranitee@email.com"));
		rg.addMember(researchers.fetchByEmail("chinmay@email.com"));

		ResearchGroup rg1 = new ResearchGroup("pranitee@email.com");
		rg1.addMember(researchers.fetchByEmail("pranitee@email.com"));
		rg1.addMember(researchers.fetchByEmail("chinmay@email.com"));

		groups.add(rg);
		groups.add(rg1);

		// Reading values from CSV
		// 1. Read paper value
		// 2. For each paper create a fictionary group woth decided members
		// 3. Set ResearchPaper to a ResearchGroup instance
		String RESEARCHER_PAPER_DATA = "resources/csv/papers.csv";

		String line = "";
		String cvsSplitBy = ",";

		try (Reader reader = new FileReader(RESEARCHER_PAPER_DATA); CSVParser csvParser = CSVFormat.DEFAULT.parse(reader)) {

			for (CSVRecord csvRecord : csvParser) {
				// Accessing values by column index
				String title = csvRecord.get(0).replace("\n", "");
				String abstractData = csvRecord.get(1).replace("\n", "");
				String results = csvRecord.get(2).replace("\n", "");
				String intro = csvRecord.get(3).replace("\n", "");
				String conclusion= csvRecord.get(4).replace("\n", "");

				ResearchGroup g = new ResearchGroup("lee");
				g.addMember(researchers.fetchByEmail("em"));

				ResearchPaper p = new ResearchPaper();
				p.setTitle(title);
				p.setAbstractText(abstractData);
				p.setResults(results);
				p.setIntro(intro);
				p.setConclusion(conclusion);

				g.setPaper(p);

				groups.add(g);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		// End of reading paper values
		dir.setResearchGroupDir(groups);

		return dir;
	}

	public static ResearchPaperDirectory initializePaperDir(ResearchGroupDirectory researchGroups) {
		ResearchPaperDirectory dir = new ResearchPaperDirectory();

		for (ResearchGroup group : researchGroups.getDir()) {
			dir.getDir().add(group.getPaper());
		}

		return dir;
	}

	public static ConferenceDirectory initializeConferenceDir() {
		ConferenceDirectory dir = new ConferenceDirectory();

		dir.getDir().add(new Conference("CodeSphere Tech Summit", "12-14-2023", "Prudential, Boston Common", new ArrayList<>(Arrays.asList("math", "name"))));

		dir.getDir().add(new Conference("InnovateTech Connect Expo", "12-14-2023", "45th St Manhattan", new ArrayList<>(Arrays.asList("math", "name"))));

		dir.getDir().add(new Conference("QuantumLeap DevCon", "12-14-2023", "San Fransisco", new ArrayList<>(Arrays.asList("math", "name"))));

		dir.getDir().add(new Conference("FutureTech Symposium", "12-14-2023", "Cambridge, MA", new ArrayList<>(Arrays.asList("math", "name"))));

		return dir;
	}

	public static ComplaintDirectory initializeComplaintDir() {
		ComplaintDirectory dir = new ComplaintDirectory();

		return dir;
	}

}
