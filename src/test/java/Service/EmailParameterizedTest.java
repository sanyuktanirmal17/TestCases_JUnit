package Service;

/************************************************************
 * Purpose :  user registration system using regex.
 * @author Sanyukta Nirmal
 * @Version 1.0
 * @since 20-06-2021
 *
 ************************************************************/

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class  EmailParameterizedTest{
	private String emailTest;
	private boolean expectedResult;

	public EmailParameterizedTest(String emailTest, boolean expectedResult) {
		this.emailTest = emailTest;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { 
			{ "abc@abc.com", true }, 
			{ "abc-100@abc.co.in", true },
			{ "abc111@abc.com", true },
			{ "abc.yz@abc.com.com", true }, 
			{ "abc.100@abc.co.au", true },
			{ "abc@gmail.com.com", true }, 
			{ "abc100@gmail.com", true }, 
			{"abc@.com", false}, 
			{"abc1+@-com", false}, 
			{"abc=@=abc.com", false},
			{".abc@abc.comabc", false},
			{"abc+10@#.com", false}
			});
	}

	@Test
	public void givenEmailValidMustRetrunResult() {
		Registration user = new Registration();
		Assert.assertEquals(expectedResult, user.checkEmailId(emailTest));
	}
} 