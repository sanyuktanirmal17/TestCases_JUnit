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
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;

@RunWith(Parameterized.class)
public class EmailParametarizedTestTrue {
	private String input;
	private Boolean expectedResult;

	public EmailParametarizedTestTrue(String input, Boolean expectedResult) {
		this.input = input;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection emailyData() {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
				{ "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
				{ "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com.com", true },
				{ "abc+100@gmail.com", true } });
	}

	Registration emailtest = null;

	@Before
	public void email() {
		emailtest = new Registration();
	}

	@Test
	public void givenEmailId_ShouldReturnTrue() {
		boolean result = emailtest.getEmail(input);
		Assert.assertEquals(expectedResult, result);
	}

}
