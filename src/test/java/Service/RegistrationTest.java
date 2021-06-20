package Service;

/************************************************************
 * Purpose :  user registration system using regex.
 * @author Sanyukta Nirmal
 * @Version 1.0
 * @since 20-06-2021
 *
 ************************************************************/
import org.junit.Assert;
import org.junit.Test;

import Service.EmailParameterizedTest;

public class RegistrationTest {

	// Test Case for FirstName return true
	@Test
	public void checkingFirstname() {
		Registration validator = new Registration();
		boolean isFirstName = validator.checkFirstname("Sanyukta");
		Assert.assertTrue(isFirstName);
	}

	// Test Case for FirstName return False
	@Test
	public void checkingFirstNameInvalidReturnFalse() {
		Registration validator = new Registration();
		boolean isFirstName = validator.checkFirstname("riya");
		Assert.assertFalse(isFirstName);
	}

	// Test Case for LastName return True
	@Test
	public void checkingLastName() {
		Registration user = new Registration();
		boolean isLastName = user.checkLastName("Jambhulkar");
		Assert.assertTrue(isLastName);
	}

	// Test Case for LastName return False
	@Test
	public void checkingLastNameInvalidMustReturnFalse() {
		Registration user = new Registration();
		boolean isLastName = user.checkLastName("Nirmal");
		Assert.assertFalse(isLastName);
	}

	// Test Case for EmailId return True
	@Test
	public void checkingEmailId() {
		Registration user = new Registration();
		boolean isEmailId = user.checkEmailId("sanyuktanirmal17@gmail.com");
		Assert.assertTrue(isEmailId);
	}

	// Test Case for EmailId return False
	@Test
	public void checkingEmailIdInvalidMustReturnFalse() {
		Registration user = new Registration();
		boolean isEmailId = user.checkEmailId(".sanyukta@111");
		Assert.assertFalse(isEmailId);
	}

	// Test Case for MobileNo return True
	@Test
	public void checkingMobileNo() {
		Registration user = new Registration();
		boolean isMobileNo = user.checkMobileNo("91 9138124143");
		Assert.assertTrue(isMobileNo);
	}

	// Test Case for MobileNo return False
	@Test
	public void checkingMobileNoInvalidMustReturnFalse() {
		Registration user = new Registration();
		boolean isMobileNo = user.checkMobileNo("656965241");
		Assert.assertFalse(isMobileNo);
	}

	// Test Case for Password return True
	@Test
	public void checkingPassWord_OneSpecialCharacter_ReturnTrue() {
		Registration user = new Registration();
		boolean isPassWord = user.checkPassWord("sanyuktanirmal17");
		Assert.assertTrue(isPassWord);
	}

	// Test Case for Password return False
	@Test
	public void checkingPassWord_WhenNoOneSpecialCharacter_ReturnFalse() {
		Registration user = new Registration();
		boolean isPassWord = user.checkPassWord("Riya1");
		Assert.assertFalse(isPassWord);
	}
}
