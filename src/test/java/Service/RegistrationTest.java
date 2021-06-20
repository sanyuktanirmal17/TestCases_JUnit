package Service;

/************************************************************
 * Purpose :  user registration system using regex.
 * @author Sanyukta Nirmal
 * @Version 1.0
 * @since 20-06-2021
 *
 ************************************************************/

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class RegistrationTest {
	Registration registration = null;

	@Before
	public void email() {
		registration = new Registration();
	}

	@Test
	public void givenFirstName_ShouldReturnTrue() {
		boolean result = registration.getFirstName("Sanyukta");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenFirstName_ShouldReturnFalse() {
		boolean result = registration.getFirstName("sanyu");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenLastName_ShouldReturnTrue() {
		boolean result = registration.getLastName("Nirmal");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenLasttName_ShouldReturnFalse() {
		boolean result = registration.getLastName("nirmal873");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPhoneNumber_ShouldReturnTrue() {
		boolean result = registration.getPhoneNumber("91 9762014911");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPhoneNumber_ShouldReturnFalse() {
		boolean result = registration.getPhoneNumber("9762");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		boolean result = registration.getPassword("SaYu231@");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPassword_ShouldReturnFalse() {
		boolean result = registration.getPassword("123");
		Assert.assertEquals(false, result);
	}
}
