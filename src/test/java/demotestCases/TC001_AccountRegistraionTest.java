package demotestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import demopageObjects.DemoHomePage;
import demopageObjects.DemoRegistraionPage;
import demopageObjects.DemoToursPage;
import demotestBase.DemoBaseClass;

public class TC001_AccountRegistraionTest extends DemoBaseClass {
	
	@Test
	public void verify_AccountRegistrationTest()
	{
		loger.info("****Starting TC001_AccountRegistraionTest****");
		
		loger.info("Opening HomePage");
		DemoHomePage dhp=new DemoHomePage(driver);
		loger.info("clicking on New Tours");
		dhp.clickonNewTours();
		
		DemoToursPage dtp=new DemoToursPage(driver);
		loger.info("clicking on  RegistrationPage");
		dtp.clickonRegister();
		
		DemoRegistraionPage drp=new DemoRegistraionPage(driver);
		
		loger.info("Providing Details of Customer");
		drp.setFirstname(randomeString().toUpperCase());
		drp.setLastname(randomeString().toUpperCase());
		drp.setPhoneNumber(randomeNumer());
		drp.setEmail(randomeString());
		drp.setAddress(randomeAlphNumeric()+"- /");
		drp.setCity(randomeString());
		drp.setState(randomeString());
		drp.setPostalCode(randomeNumer());
		drp.setCountry(randomeString());
		drp.setUsername(randomeString());
		String password=randomeAlphNumeric();
		
		drp.setPassword(password);
		drp.setConfirmPassword(password);
		drp.clickonSubmit();
		String displaymsg=drp.getConfirmationmsg();
		
		if(displaymsg.equals("Thank you for registering. You may now sign-in using the user name and password you've just entered."))
		{
			loger.info("Test is passed");
			Assert.assertTrue(true);
		}
		else
		{
			loger.info("Test is failed");
			Assert.assertTrue(false);
		}
		
		loger.info("****TC001_AccountRegistraionTest is Finished****");
	}
	

}
