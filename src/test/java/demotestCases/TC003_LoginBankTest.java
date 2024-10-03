package demotestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import demopageObjects.AddingBankPage;
import demopageObjects.DemoHomePage;
import demotestBase.DemoBaseClass;

public class TC003_LoginBankTest extends DemoBaseClass {
	
	@Test
	public void Verify_Login()
	{
		try {
		loger.info("****Starting TC003_LoginBankTest****" );
		
		loger.info("Open Demo99 URL");
		DemoHomePage dhp=new DemoHomePage(driver);
		loger.info("Clicking on BankProject");
		dhp.clickonBankProject();
		
		AddingBankPage abp=new AddingBankPage(driver);
		loger.info("Providing Login Credentials");
		abp.setUsername(p.getProperty("username1"));
		
		abp.setPassword(p.getProperty("password1"));
		
		abp.clickonLogin();
		
		String msg=abp.headerisDisplayed();
		
		if(msg.equalsIgnoreCase("Gtpl Bank"))
		{
			loger.info("Test case is Passed");
			Assert.assertTrue(true);
		}
		else
		{
			loger.info("Test case is Failed");
			Assert.assertTrue(false);
		}
		}
		catch(Exception e)
		{
			
			
			Assert.fail();
		}
	loger.info("****Finished TC003_LoginBankTest****");
		
	}

}
