package Service;

/************************************************************
 * Purpose :  user registration system using regex.
 * @author Sanyukta Nirmal
 * @Version 1.0
 * @since 20-06-2021
 *
 ************************************************************/

	import java.util.Scanner;
	import java.util.regex.Pattern;

	public class Registration {
		
		/**
		 * @param firstName
		 * @return True if matches regex pattern orterwise false
		 */
		public  boolean getFirstName(String firstName) {
			return Pattern.matches("[A-Z]+[a-z]{2,}", firstName);
		}
		
		/**
		 * @param lastName
		 * @return True if matches regex pattern orterwise false
		 */
		public boolean getLastName(String lastName) {
			return Pattern.matches("[A-Z]+[a-z]{2,}", lastName);
		}
		
		/**
		 * @param phone
		 * @return True if matches regex pattern orterwise false
		 */
		public boolean getPhoneNumber(String phone) {
			return Pattern.matches("^[1-9][0-9]\s[1-9]{10}$", phone);
		}
		
		/**
		 * @param email
		 * @return True if matches regex pattern otherwise false
		 */
		public boolean getEmail(String email) {
			return Pattern.matches("^[a-z0-9.+-]+@[A-Za-z0-9.-]+.[A-Za-z]{2,6}$", email);	
		}
		
		/**
		 * @param password
		 * @return True if matches regex pattern orterwise false
		 */
		public boolean getPassword(String password) {
			return Pattern.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[a-zA-z0-9!@#$%^&*()_+=-{};':<>,./?~`]).{8,}$", password);	
		}

	}


