
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
	public class EmailParametarizedTestFalse {
		private String input;
		private Boolean expectedResult;
		
		public EmailParametarizedTestFalse(String input,Boolean expectedResult) {
			this.input=input;
			this.expectedResult = expectedResult;
		}
		
		@Parameterized.Parameters
		public static Collection emailData() {
			return Arrays.asList(new Object[][] {{"abc-",false},{"abc@.com.my",false},{"abc123@gmail.a",false},
				{"abc123@.com",false},{"abc123@.com.com",false},{".abc@abc.com",false},{"abc..2002@gmail.com",false},
				{"abc.@gmail.com",false},{"abc@abc@gmail.com",false},{"abc@gmail.com.1a",false}});
		}
		
		Registration emailtest = null;
		
		@Before
		public void email() {
			emailtest = new Registration();
		}
		
		@Test
		public void givenEmailId_ShouldReturnFalse() {
			boolean result = emailtest.getEmail(input);
			Assert.assertEquals(expectedResult, result);
		}

}
