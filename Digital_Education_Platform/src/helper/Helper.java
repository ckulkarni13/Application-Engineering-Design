/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;


import java.awt.Component;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author drag
 */
public class Helper {

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

	public static void captureScreenshot(Component component) {
		try {
			Robot robot = new Robot();
			Rectangle area = component.getBounds();
			BufferedImage screenshot = robot.createScreenCapture(area);

			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setDialogTitle("Save Screenshot");
			int userSelection = fileChooser.showSaveDialog(null);

			if (userSelection == JFileChooser.APPROVE_OPTION) {
				File fileToSave = fileChooser.getSelectedFile();
				ImageIO.write(screenshot, "png", fileToSave);
				System.out.println("Screenshot saved to: " + fileToSave.getAbsolutePath());
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static boolean validatePhone(String fieldName, String fieldValue) {
		// Ensure that the phone field contains only numbers.
		if (fieldValue.isEmpty() || !fieldValue.matches("^[0-9]+$")) {
			JOptionPane.showMessageDialog(null,fieldName + " is not a valid phone number");
			return false;
		}

		return true;
	}

	public static boolean validatePassword(String fieldName, String fieldValue) {
		if (fieldValue.isEmpty() || fieldValue.length() < 6) {
			JOptionPane.showMessageDialog(null,fieldName + " is not a valid password");
			return false;
		}

		return true;
	}
	public static boolean validateEmail(String fieldName, String fieldValue) {
		// Use a regular expression to validate the email format.
		String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(fieldValue);

		if (fieldValue.isEmpty() || !matcher.matches()) {
			JOptionPane.showMessageDialog(null,fieldName + " is not a valid email address");
			return false;
		}

		return true;
	}
}
