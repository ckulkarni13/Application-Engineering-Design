/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enterprise.auth;

import java.util.Date;
import java.util.UUID;
import java.util.regex.Pattern;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author drag
 */
public class Auth {
	private static final String EMAIL_REGEX
	    = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@email\\.com$";
	private static final Pattern pattern = Pattern.compile(EMAIL_REGEX);


	public static void sendVerificationEmail () {

		System.out.println("Send verification email");		// take user profile as args and send mail to their email address
	}

	public static boolean validateEmail(String email) {
		return pattern.matcher(email).matches();
	}

	public static String getEncryptedPassword(String password) {
		return BCrypt.hashpw(password, BCrypt.gensalt());
	}

	public static boolean checkPassword(String potentialPassword, String hashed) {
		return BCrypt.checkpw(potentialPassword, hashed);
	}

	public static String generateUUID() {
		return UUID.randomUUID().toString();
	}

	public static String generateTimeStamp() {
		return new Date().toString();
	}

}
