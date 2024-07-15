/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package directory;

import constants.Role;
import helper.Helper;
import java.util.ArrayList;
import java.util.List;
import model.Person;
import model.User;

/**
 *
 * @author drag
 */
public class UserDirectory {
	private List<User> directory;

	public UserDirectory() {
		this.directory = new ArrayList<>();
		this.populateUsers(10);
	}

	public void addUser(User u){
		this.directory.add(u);
	}

	private void populateUsers(int n) {
		Person p = null;

		/**
		 * Students
		 */
		p = new Person("Atharva", "K", "atharva@email.com", "231 park dr", "boston MA", "856123123");
		directory.add(new User("a", "a", true, p, Role.STUDENT));

		p = new Person("John", "Doe", "john@email.com", "231 park dr", "boston MA", "856123123");
		directory.add(new User("john", "a", true, p, Role.STUDENT));

		p = new Person("Jane", "Doe", "jane@email.com", "231 park dr", "boston MA", "856123123");
		directory.add(new User("jane", "a", true, p, Role.STUDENT));

		p = new Person("Chinmay", "Kulkarni", "chinmay@email.co", "231 park dr", "boston MA", "856123123");
		directory.add(new User("chin", "a", true, p, Role.STUDENT));

		p = new Person("Pranitee", "Majukar", "pranitee@email.co", "231 park dr", "boston MA", "856123123");
		directory.add(new User("pran", "a", true, p, Role.STUDENT));
			
		p = new Person("Mary", "Johnson", "mary.johnson@email.com", "456 Elm St", "Los Angeles, CA", "555-234-5678");
		directory.add(new User("mary", "password", true, p, Role.STUDENT));

		p = new Person("David", "Lee", "david.lee@email.com", "789 Oak St", "Chicago, IL", "555-345-6789");
		directory.add(new User("david", "password", true, p, Role.STUDENT));

		p = new Person("Jennifer", "Wilson", "jennifer.wilson@email.com", "101 Pine St", "Houston, TX", "555-456-7890");
		directory.add(new User("jennifer", "password", true, p, Role.STUDENT));

		p = new Person("Michael", "Brown", "michael.brown@email.com", "202 Maple St", "Philadelphia, PA", "555-567-8901");
		directory.add(new User("michael", "password", true, p, Role.STUDENT));

		p = new Person("Linda", "Davis", "linda.davis@email.com", "303 Birch St", "Phoenix, AZ", "555-678-9012");
		directory.add(new User("linda", "password", true, p, Role.STUDENT));

		p = new Person("Robert", "Anderson", "robert.anderson@email.com", "404 Cedar St", "San Antonio, TX", "555-789-0123");
		directory.add(new User("robert", "password", true, p, Role.STUDENT));

		p = new Person("Susan", "Martinez", "susan.martinez@email.com", "505 Redwood St", "San Diego, CA", "555-890-1234");
		directory.add(new User("susan", "password", true, p, Role.STUDENT));

		p = new Person("James", "Garcia", "james.garcia@email.com", "606 Elmwood St", "Dallas, TX", "555-901-2345");
		directory.add(new User("james", "password", true, p, Role.STUDENT));

		p = new Person("Karen", "Rodriguez", "karen.rodriguez@email.com", "707 Oakwood St", "San Jose, CA", "555-012-3456");
		directory.add(new User("karen", "password", true, p, Role.STUDENT));

		p = new Person("Emily", "Johnson", "emily.johnson@email.com", "123 Oak St", "Boston, MA", "555-123-4567");
		directory.add(new User("emily", "password", true, p, Role.STUDENT));

		p = new Person("Daniel", "Wilson", "daniel.wilson@email.com", "456 Maple St", "Los Angeles, CA", "555-234-5678");
		directory.add(new User("daniel", "password", true, p, Role.STUDENT));

		p = new Person("Olivia", "Smith", "olivia.smith@email.com", "789 Birch St", "Chicago, IL", "555-345-6789");
		directory.add(new User("olivia", "password", true, p, Role.STUDENT));

		p = new Person("William", "Davis", "william.davis@email.com", "101 Cedar St", "Houston, TX", "555-456-7890");
		directory.add(new User("william", "password", true, p, Role.STUDENT));

		p = new Person("Sophia", "Martinez", "sophia.martinez@email.com", "202 Pine St", "Philadelphia, PA", "555-567-8901");
		directory.add(new User("sophia", "password", true, p, Role.STUDENT));

		p = new Person("Alexander", "Brown", "alexander.brown@email.com", "303 Redwood St", "Phoenix, AZ", "555-678-9012");
		directory.add(new User("alexander", "password", true, p, Role.STUDENT));

		p = new Person("Ava", "Jones", "ava.jones@email.com", "404 Elmwood St", "San Antonio, TX", "555-789-0123");
		directory.add(new User("ava", "password", true, p, Role.STUDENT));

		p = new Person("Mason", "Garcia", "mason.garcia@email.com", "505 Oakwood St", "San Diego, CA", "555-890-1234");
		directory.add(new User("mason", "password", true, p, Role.STUDENT));

		p = new Person("Isabella", "Rodriguez", "isabella.rodriguez@email.com", "606 Cedar St", "Dallas, TX", "555-901-2345");
		directory.add(new User("isabella", "password", true, p, Role.STUDENT));

		p = new Person("Oliver", "Anderson", "oliver.anderson@email.com", "707 Maplewood St", "San Jose, CA", "555-012-3456");
		directory.add(new User("oliver", "password", true, p, Role.STUDENT));

		p = new Person("Liam", "Wilson", "liam.wilson@email.com", "808 Forest St", "Seattle, WA", "555-123-4567");
		directory.add(new User("liam", "password", true, p, Role.STUDENT));

		p = new Person("Charlotte", "Taylor", "charlotte.taylor@email.com", "909 Pine St", "Austin, TX", "555-234-5678");
		directory.add(new User("charlotte", "password", true, p, Role.STUDENT));

		p = new Person("Benjamin", "Lee", "benjamin.lee@email.com", "1011 Birch St", "San Francisco, CA", "555-345-6789");
		directory.add(new User("benjamin", "password", true, p, Role.STUDENT));

		p = new Person("Emma", "Johnson", "emma.johnson@email.com", "1212 Oak St", "Miami, FL", "555-456-7890");
		directory.add(new User("emma", "password", true, p, Role.STUDENT));

		p = new Person("Aiden", "Brown", "aiden.brown@email.com", "1313 Cedar St", "Denver, CO", "555-567-8901");
		directory.add(new User("aiden", "password", true, p, Role.STUDENT));

		p = new Person("Amelia", "Williams", "amelia.williams@email.com", "1414 Maple St", "Orlando, FL", "555-678-9012");
		directory.add(new User("amelia", "password", true, p, Role.STUDENT));

		p = new Person("Jackson", "Hernandez", "jackson.hernandez@email.com", "1515 Redwood St", "Las Vegas, NV", "555-789-0123");
		directory.add(new User("jackson", "password", true, p, Role.STUDENT));

		p = new Person("Sophie", "Garcia", "sophie.garcia@email.com", "1616 Elmwood St", "Portland, OR", "555-890-1234");
		directory.add(new User("sophie", "password", true, p, Role.STUDENT));

		p = new Person("Mike", "Smith", "michael.smith@email.com", "1717 Oakwood St", "Atlanta, GA", "555-901-2345");
		directory.add(new User("mike", "password", true, p, Role.STUDENT));

		p = new Person("Grace", "Miller", "grace.miller@email.com", "1818 Pine St", "Tampa, FL", "555-012-3456");
		directory.add(new User("grace", "password", true, p, Role.STUDENT));

		p = new Person("Lucas", "Moore", "lucas.moore@email.com", "1919 Cedar St", "Raleigh, NC", "555-123-4567");
		directory.add(new User("lucas", "password", true, p, Role.STUDENT));

		p = new Person("Madison", "Martin", "madison.martin@email.com", "2020 Maplewood St", "Nashville, TN", "555-234-5678");
		directory.add(new User("madison", "password", true, p, Role.STUDENT));

		p = new Person("Henry", "White", "henry.white@email.com", "2121 Forest St", "New Orleans, LA", "555-345-6789");
		directory.add(new User("henry", "password", true, p, Role.STUDENT));

		p = new Person("Ella", "Hernandez", "ella.hernandez@email.com", "2222 Elm St", "Chicago, IL", "555-456-7890");
		directory.add(new User("ella", "password", true, p, Role.STUDENT));

		p = new Person("Avery", "Clark", "avery.clark@email.com", "2424 Oak St", "San Jose, CA", "555-678-9012");
		directory.add(new User("avery", "password", true, p, Role.STUDENT));

		p = new Person("Matthew", "Davis", "matthew.davis@email.com", "2525 Cedar St", "Phoenix, AZ", "555-789-0123");
		directory.add(new User("matthew", "password", true, p, Role.STUDENT));

		p = new Person("Harper", "Thompson", "harper.thompson@email.com", "2626 Pine St", "Seattle, WA", "555-890-1234");
		directory.add(new User("harper", "password", true, p, Role.STUDENT));

		p = new Person("Ethan", "Harris", "ethan.harris@email.com", "2727 Elmwood St", "Los Angeles, CA", "555-901-2345");
		directory.add(new User("ethan", "password", true, p, Role.STUDENT));

		p = new Person("Addison", "Turner", "addison.turner@email.com", "2828 Oakwood St", "Houston, TX", "555-012-3456");
		directory.add(new User("addison", "password", true, p, Role.STUDENT));


		/**
		 * Professors
		 */
		p = new Person("Dr. Jim", "Halpert", "jim@email.com", "231 park dr", "Scranton PA", "856123123");
		directory.add(new User("b", "p", true, p, Role.PROFESSOR));

		p = new Person("Dr. Andy", "", "andy@email.com", "231 park dr", "Scranton PA", "856123123");
		directory.add(new User("c", "p", true, p, Role.PROFESSOR));

		p = new Person("Dr. Dwight", "Shrute", "dwight@dunder.com", "231 park dr", "Scranton PA", "856123123");
		directory.add(new User("d", "p", true, p, Role.PROFESSOR));

		p = new Person("Dr. Olin", "", "olin@dunder.com", "231 park dr", "Scranton PA", "856123123");
		directory.add(new User("polin", "p", true, p, Role.PROFESSOR));

		p = new Person("Dr. Carol", "", "carol@email.com", "231 park dr", "Scranton PA", "856123123");
		directory.add(new User("pcarol", "p", true, p, Role.PROFESSOR));

		p = new Person("Dr. Amelia", "", "amelia@email.com", "231 park dr", "Scranton PA", "856123123");
		directory.add(new User("pamelia", "p", true, p, Role.PROFESSOR));

		p = new Person("Dr. Abigail", "Potter", "abigail@email.com", "231 park dr", "Scranton PA", "856123123");
		directory.add(new User("pabigail", "p", true, p, Role.PROFESSOR));

		p = new Person("Dr. Anthony", "Davis", "anthony@email.com", "231 park dr", "Scranton PA", "856123123");
		directory.add(new User("panthony", "p", true, p, Role.PROFESSOR));

		p = new Person("Dr. Harry", "", "abigail@email.com", "231 park dr", "Scranton PA", "856123123");
		directory.add(new User("pharry", "p", true, p, Role.PROFESSOR));
		
		p = new Person("Dr. Michael", "Smith", "michael.smith@email.com", "808 Forest St", "Scranton, PA", "555-123-4567");
		directory.add(new User("msmith", "password", true, p, Role.PROFESSOR));

		p = new Person("Dr. Olivia", "Johnson", "olivia.johnson@email.com", "909 Pine St", "Scranton, PA", "555-234-5678");
		directory.add(new User("ojohnson", "password", true, p, Role.PROFESSOR));

		p = new Person("Dr. William", "Brown", "william.brown@email.com", "1011 Birch St", "Scranton, PA", "555-345-6789");
		directory.add(new User("wbrown", "password", true, p, Role.PROFESSOR));

		p = new Person("Dr. Emma", "Davis", "emma.davis@email.com", "1212 Oak St", "Scranton, PA", "555-456-7890");
		directory.add(new User("edavis", "password", true, p, Role.PROFESSOR));

		p = new Person("Dr. Noah", "Miller", "noah.miller@email.com", "1313 Cedar St", "Scranton, PA", "555-567-8901");
		directory.add(new User("nmiller", "password", true, p, Role.PROFESSOR));

		p = new Person("Dr. Sophia", "Thompson", "sophia.thompson@email.com", "1414 Maple St", "Scranton, PA", "555-678-9012");
		directory.add(new User("sthompson", "password", true, p, Role.PROFESSOR));

		p = new Person("Dr. Benjamin", "Garcia", "benjamin.garcia@email.com", "1515 Redwood St", "Scranton, PA", "555-789-0123");
		directory.add(new User("bgarcia", "password", true, p, Role.PROFESSOR));

		p = new Person("Dr. Ava", "Anderson", "ava.anderson@email.com", "1616 Elmwood St", "Scranton, PA", "555-890-1234");
		directory.add(new User("aanderson", "password", true, p, Role.PROFESSOR));

		p = new Person("Dr. Mason", "Williams", "mason.williams@email.com", "1717 Oakwood St", "Scranton, PA", "555-901-2345");
		directory.add(new User("mwilliams", "password", true, p, Role.PROFESSOR));



		/**
		 * Special roles - ADMIN, Certification and Employer
		 */
		p = new Person("ADMIN", "", "admin@email.com", "231 park dr", "Scranton PA", "856123123");
		directory.add(new User("admin", "admin", true, p, Role.ADMIN));

		p = new Person("Certification", "Authority", "certify@email.com", "231 park dr", "Scranton PA", "856123123");
		directory.add(new User("cr", "cr", true, p, Role.CERTIFICATION_AUTH));

		p = new Person("Employer", "Authority", "employer@email.com", "231 park dr", "Scranton PA", "856123123");
		directory.add(new User("em", "em", true, p, Role.EMPLOYER));
	}

	

	public List<User> getDirectory() {
		return directory;
	}

	/**
	 *
	 * @param directory
	 */
	public void setDirectory(List<User> directory) {
		this.directory = directory;
	}

	public User getUser(String userName, String password) {
		for (User u : this.directory) {
			if (u.getUserName().equals(userName) && Helper.checkPassword(password, u.getPassword())) {
				return u;
			}
		}

		return null;
	}

	public User getUser(String uuid) {
		return null;
	}
	
}
