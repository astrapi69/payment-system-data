package de.alpharogroup.payment.system.iban;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Test class for the class {@link BankaccountExtensions}.
 * 
 * @version 1.0
 * @author Asterios Raptis
 */
public class BankaccountExtensionsTest
{

	/** The valide iban for tests. */
	private String valideIban;

	/** The wrong iban for tests. */
	private String invalideIban;

	/** The boolean for the result from the test. */
	private boolean result;

	/** The locale for Austria. */
	private String atLocale;

	/** The locale for Germany. */
	private String deLocale;

	/**
	 * Sets up method will be invoked before every unit test method in this class.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@BeforeMethod
	protected void setUp() throws Exception
	{
		this.valideIban = "AT782032017000303657";
		this.invalideIban = "AT82032017000303657";
		this.atLocale = "AT";
		this.deLocale = "DE";
	}

	/**
	 * Tear down method will be invoked after every unit test method in this class.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@AfterMethod
	protected void tearDown() throws Exception
	{
	}

	/**
	 * Test method for {@link de.alpharogroup.iban.BankaccountExtensions#isIbanNumber(java.lang.String)}.
	 * 
	 * @throws Exception
	 *             is thrown if an error occurs when checking the given ibanNumber
	 */
	@Test
	public void testIsIbanNumber() throws Exception
	{
		this.result = BankaccountExtensions.isIbanNumber(this.valideIban);
		AssertJUnit.assertTrue("", this.result);
		this.result = BankaccountExtensions.isIbanNumber(this.invalideIban);
		AssertJUnit.assertFalse("", this.result);

	}

	/**
	 * Test method for
	 * {@link de.alpharogroup.iban.BankaccountExtensions#replaceCharsWithNumbers(java.lang.String)} .
	 * 
	 * @throws Exception
	 *             is thrown if an error occurs when tryin to replace the char with numbers
	 */
	@Test
	public void testReplaceCharsWithNumbers() throws Exception
	{
		String expected = "1029";
		String compare = BankaccountExtensions.replaceCharsWithNumbers(this.atLocale);
		this.result = expected.equals(compare);
		AssertJUnit.assertTrue("", this.result);
		// -------------------
		expected = "1314";
		compare = BankaccountExtensions.replaceCharsWithNumbers(this.deLocale);
		this.result = expected.equals(compare);
		AssertJUnit.assertTrue("", this.result);

	}

}

